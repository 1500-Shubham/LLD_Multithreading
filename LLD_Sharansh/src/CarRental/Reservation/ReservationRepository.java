package CarRental.Reservation;

import CarRental.enums.ReservationStatus;

import java.util.Map;

public class ReservationRepository {
    Map<Integer,Reservation > reservations;

    public  void save(Reservation r){
        this.reservations.put(r.reservationId,r);
    }
    public Reservation findById(int reservationId){
        return this.reservations.get(reservationId);
    }
    public void remove(int reservationId){
        this.reservations.remove(reservationId);
        return ;
    }


}
