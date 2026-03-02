package ParkingLot.Payment;

public class CashPayment implements Payment{
    @Override
    public boolean pay(double amount) {

        System.out.println("Cash Payment is done of amount " + amount);
        return true;

    }
}
