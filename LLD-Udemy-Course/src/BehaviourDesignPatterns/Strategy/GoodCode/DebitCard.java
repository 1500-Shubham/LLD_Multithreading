package BehaviourDesignPatterns.Strategy.GoodCode;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying with debit card");
    }
}
