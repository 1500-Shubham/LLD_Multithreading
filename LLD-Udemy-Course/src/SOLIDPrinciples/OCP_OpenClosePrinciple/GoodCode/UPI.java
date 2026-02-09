package SOLIDPrinciples.OCP_OpenClosePrinciple.GoodCode;

public class UPI implements PaymentMethod{

    @Override
    public void pay(String amount){
        System.out.println("UPI Paid"+amount);
    }
}
