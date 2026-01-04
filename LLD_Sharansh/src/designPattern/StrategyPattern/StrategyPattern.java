package designPattern.StrategyPattern;

/// Problem:
//class PaymentProcess{
//    public void doPayment(String type){
//        if (type.equals("CREDIT")){
//            System.out.println("CREDIT Payment");
//        }else if (type.equals("CRYPTO")){
//            System.out.println("CRPTOY Payment");
//        }}
//        }
//    This class is violating open close principla as more payment option aaye toh dikkat

interface  PaymentType{
    void doPayment();
}
class CreditPayment implements PaymentType{
    @Override
    public void doPayment() {
        System.out.println("CREDIT Payment");
    }
}
class CryptoPayment implements PaymentType{
    @Override
    public void doPayment() {
        System.out.println("Crypto Payment");
    }
}

class PaymentProcess{
    PaymentType paymentType;
    PaymentProcess(PaymentType obj){
        this.paymentType = obj;
    }

    public void doPayment(){
        paymentType.doPayment();
//        Now whatever object is passed to this it will call that function
    }
}




public class StrategyPattern {

    public static void Main(){
        PaymentType credit= new CreditPayment();
        PaymentProcess paymentProcess = new PaymentProcess(credit);
        paymentProcess.doPayment();
    }
}
