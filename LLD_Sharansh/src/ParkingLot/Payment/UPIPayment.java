package ParkingLot.Payment;

public class UPIPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("UPI Payment made of amount"+ amount);
        return true;
    }
}
