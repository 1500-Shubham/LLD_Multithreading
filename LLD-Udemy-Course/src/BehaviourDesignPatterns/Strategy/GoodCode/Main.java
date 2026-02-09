package BehaviourDesignPatterns.Strategy.GoodCode;

public class Main {


    public static void main(String[] args) {
        PaymentMethod credit = new CreditCard();
        PaymentMethod debit = new DebitCard();
        PaymentService paymentService = new PaymentService();
        paymentService.pay(credit);
        paymentService.pay(debit);
    }



}
