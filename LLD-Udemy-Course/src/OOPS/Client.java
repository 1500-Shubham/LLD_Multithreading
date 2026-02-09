package OOPS;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello, OOPS!");

        PaymentService paymentService = new PaymentService();
        PaymentMethod credit = new CreditCard("123","AUCRedit");
        PaymentMethod debit = new DebitCard("123","AUDebit");
        PaymentMethod upi = new UPI("788932");

        paymentService.addPayment("ShubhamCredit",credit);
        paymentService.addPayment("ShubhamDebit",debit);
        paymentService.addPayment("ShubhamUPI",upi);

        paymentService.makePayment("ShubhamCredit");
        paymentService.makePayment("ShubhamDebit");
        paymentService.makePayment("ShubhamUPI");

    }

}
