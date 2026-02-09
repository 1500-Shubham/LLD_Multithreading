package BehaviourDesignPatterns.Strategy.BadCode;

 class PaymentService{

    public void pay(String paymentMethod){
        if(paymentMethod.equals("CreditCard")){
            System.out.println("Paying with credit card");
        }else if(paymentMethod.equals("DebitCard")){
            System.out.println("Paying with debit card");
        }
        else{
            System.out.println("Unsupported Payment Method");
        }
    }
}



public class WithoutStrategy {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.pay("CreditCard");
    }

}
