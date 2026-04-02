package CarRental.Vehicle;

import CarRental.Reservation.Reservation;
import CarRental.Reservation.ReservationRepository;
import CarRental.enums.VehicleStatus;
import CarRental.enums.VehicleType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class VehicleInventoryManager {
    ConcurrentMap<Integer,Vehicle> vehicles;
    ConcurrentMap<Integer, List<Integer>> vehicleBookingIds; // reservationIds
    ConcurrentMap<Integer, ReentrantLock> vehicleLock; //each vehicle lock

    ReservationRepository reservationRepository;

    public void setReservationRepository(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    ReentrantLock lockForVehicle(int vehicleId){
        if(vehicleLock.get(vehicleId) == null){
            vehicleLock.put(vehicleId,new ReentrantLock());
        }
        return vehicleLock.get(vehicleId);
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.put(vehicle.getVehicleId(),vehicle);
    }

    public Vehicle getVehicle(int vehicleId){
        return this.vehicles.get(vehicleId);
    }


    public boolean isAvailable(int vehicleId, Date from ,Date to){
        Vehicle vehicle = vehicles.get(vehicleId);
        if(vehicle.vehicleStatus == VehicleStatus.MAINTENANCE || vehicle == null) return false;


        List<Integer> reservation = vehicleBookingIds.get(vehicleId);
        if(reservation == null || reservation.isEmpty()) return true;
//        no previous reservation return true

        for( Integer reservationId : reservation){
            Reservation r = reservationRepository.findById(reservationId);
//            overlapping any reservation false return
            if(r.getBookedFrom().before(from) || r.getBookedTo().after(to)) return false;
        }
        return true;
    }

    public boolean bookVehicle(int vehicleId, int reservationId, Date from ,Date to){
        ReentrantLock lock = lockForVehicle(vehicleId);
        lock.lock();
        try {
            if (!isAvailable(vehicleId, from, to)) return false;
//        cant book overlapping vechile

            vehicleBookingIds.putIfAbsent(vehicleId, new ArrayList<>());
            vehicleBookingIds.get(vehicleId).add(reservationId);

            vehicles.get(vehicleId).setVehicleStatus(VehicleStatus.BOOKED);
            return  true;
        }
        finally {
            lock.unlock();
        }


    }
    // --------------- Atomic Release -----------------

    public void release(int vehicleId, int reservationId) {

        ReentrantLock lock = lockForVehicle(vehicleId);
        lock.lock();

        try {
            // remove reservation Id
            List<Integer> ids = vehicleBookingIds.get(vehicleId);
            if (ids != null) {
                ids.remove(Integer.valueOf(reservationId));
            }

            // if no more bookings → available
            List<Integer> stillBooked = vehicleBookingIds.get(vehicleId);
            if (stillBooked == null || stillBooked.isEmpty()) {
                vehicles.get(vehicleId).setVehicleStatus(VehicleStatus.AVAILABLE);
            }

        } finally {
            lock.unlock();
        }
    }

    public List<Vehicle> getAvailableVehicles(
            VehicleType type,
            Date from,
            Date to
    ){

       return  vehicles.values().stream().filter(v -> v.getVehicleType() == type)
                .filter(v -> isAvailable(v.getVehicleId(),from,to))
                .collect(Collectors.toList());
    }


}
