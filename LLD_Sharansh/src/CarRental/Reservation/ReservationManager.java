package CarRental.Reservation;

import CarRental.User;
import CarRental.Vehicle.VehicleInventoryManager;
import CarRental.enums.ReservationStatus;
import CarRental.enums.ReservationType;
import CarRental.enums.VehicleStatus;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ReservationManager {
public  final VehicleInventoryManager inventory;
public  final ReservationRepository reservationRepository;
public  final AtomicInteger reservationId = new AtomicInteger(1);

    public ReservationManager(VehicleInventoryManager inventory) {
        this.inventory = inventory;
        this.reservationRepository =  new ReservationRepository();
        this.inventory.setReservationRepository(this.reservationRepository);
    }

    public  Reservation createReservation(int vehicleId, User user, Date from , Date to){
    int reservationIdGenerated = reservationId.getAndIncrement();

    if(! this.inventory.bookVehicle(vehicleId,reservationIdGenerated,from,to)){
        throw new RuntimeException("Vehicle not available for selected dates");
    }
    Reservation reservation = new Reservation(reservationIdGenerated,vehicleId,user.getUserId(),from,to, ReservationType.DAILY, ReservationStatus.SCHEDULED);
    reservationRepository.save(reservation);
    return reservation;
}

public Reservation findById(int reservationID){
    return reservationRepository.findById(reservationID);
}

public void cancelReservation(int reservationId){
     Reservation reservation = reservationRepository.findById(reservationId);
     reservation.setReservationStatus(ReservationStatus.CANCELLED);
     inventory.release(reservation.getVehicleId(),reservationId);
        this.reservationRepository.remove(reservationId);
     return;
}

public void startTrip(int reservationId){
//     when creating reservation vehicle status updated to BOOKED
    Reservation reservation = reservationRepository.findById(reservationId);
    reservation.setReservationStatus(ReservationStatus.IN_USE);
}

    public void completeTrip(int reservationId){
        Reservation reservation = reservationRepository.findById(reservationId);
        reservation.setReservationStatus(ReservationStatus.COMPLETED);
        inventory.release(reservation.getVehicleId(),reservationId);
    }

    public void remove(int reservationId){
        this.reservationRepository.remove(reservationId);
        return;
    }

}
