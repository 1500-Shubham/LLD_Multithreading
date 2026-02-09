package SOLIDPrinciples.OCP_OpenClosePrinciple.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(String amount) {
        System.out.println("Credit Card Paid"+amount);
    }
}
