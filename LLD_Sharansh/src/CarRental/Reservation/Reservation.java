package CarRental.Reservation;

import CarRental.enums.ReservationStatus;
import CarRental.enums.ReservationType;

import java.util.Date;

public class Reservation {
//    POJO class
    int reservationId;
    int vehicleId;
    int userId;
    Date bookedFrom;
    Date bookedTo;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

    public Reservation(int reservationId, int vehicleId, int userId, Date bookedFrom, Date bookedTo, ReservationType reservationType, ReservationStatus reservationStatus) {
        this.reservationId = reservationId;
        this.vehicleId = vehicleId;
        this.userId = userId;
        this.bookedFrom = bookedFrom;
        this.bookedTo = bookedTo;
        this.reservationType = reservationType;
        this.reservationStatus = reservationStatus;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(Date bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public Date getBookedTo() {
        return bookedTo;
    }

    public void setBookedTo(Date bookedTo) {
        this.bookedTo = bookedTo;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
