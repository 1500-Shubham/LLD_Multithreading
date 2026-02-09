package BehaviourDesignPatterns.Strategy.GoodCode;

public class PaymentService {

    void pay(PaymentMethod pm){
        pm.pay();
    }
}
