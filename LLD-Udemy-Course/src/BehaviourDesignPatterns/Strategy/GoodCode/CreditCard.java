package BehaviourDesignPatterns.Strategy.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying with credit card");
    }
}
