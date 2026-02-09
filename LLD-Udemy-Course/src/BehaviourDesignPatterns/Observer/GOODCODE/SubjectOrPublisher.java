package BehaviourDesignPatterns.Observer.GOODCODE;

public interface SubjectOrPublisher {

    void addObs(ObserverOrSubscriber observerOrSubscriber);
    void deleteObs(ObserverOrSubscriber observerOrSubscriber);

    void notifyObserver(String temp);

}
