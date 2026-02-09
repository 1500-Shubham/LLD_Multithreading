package BehaviourDesignPatterns.Observer.GOODCODE;

import BehaviourDesignPatterns.Observer.BADCODE.MobileDevice;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements  SubjectOrPublisher{
    List<ObserverOrSubscriber> observerOrSubscriberList;
//    Loose coupling due to interace runtime Polymorphism
    public WeatherStation(){
        this.observerOrSubscriberList = new ArrayList<>();
    }

    public void setTemp(String temp){
        System.out.println("Weather Station Temp set to "+ temp);
        notifyObserver(temp);
    }

    @Override
    public void addObs(ObserverOrSubscriber observerOrSubscriber) {
        observerOrSubscriberList.add(observerOrSubscriber);
    }

    @Override
    public void deleteObs(ObserverOrSubscriber observerOrSubscriber) {
        observerOrSubscriberList.remove(observerOrSubscriber);
    }

    @Override
    public void notifyObserver(String temp) {
        for(ObserverOrSubscriber o : observerOrSubscriberList){
            o.notify(temp);
        }
    }
}
