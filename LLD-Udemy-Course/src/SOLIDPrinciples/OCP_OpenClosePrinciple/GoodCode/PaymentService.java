package SOLIDPrinciples.OCP_OpenClosePrinciple.GoodCode;

public class PaymentService {

    public void pay(PaymentMethod pm,String amount){
        pm.pay(amount);
    }


}
