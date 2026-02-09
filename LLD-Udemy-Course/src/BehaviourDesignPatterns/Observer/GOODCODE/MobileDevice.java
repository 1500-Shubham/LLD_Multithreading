package BehaviourDesignPatterns.Observer.GOODCODE;

public class MobileDevice implements ObserverOrSubscriber {

    @Override
    public void notify(String temp) {
        System.out.println("Mobile Device showing temp is " + temp);
    }
}
