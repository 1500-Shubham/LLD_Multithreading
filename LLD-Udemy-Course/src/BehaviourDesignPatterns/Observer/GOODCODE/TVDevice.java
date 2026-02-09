package BehaviourDesignPatterns.Observer.GOODCODE;

public class TVDevice implements ObserverOrSubscriber{
    @Override
    public void notify(String temp) {
        System.out.println("TV Device temp showing" + temp);
    }
}
