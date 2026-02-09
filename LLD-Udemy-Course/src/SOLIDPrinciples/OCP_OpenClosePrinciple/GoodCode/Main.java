package SOLIDPrinciples.OCP_OpenClosePrinciple.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        PaymentMethod credit = new CreditCard();
        paymentService.pay(credit,"1000");
        PaymentMethod upi = new UPI();
        paymentService.pay(upi,"1000");

    }
}
