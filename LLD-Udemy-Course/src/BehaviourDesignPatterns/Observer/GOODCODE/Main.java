package BehaviourDesignPatterns.Observer.GOODCODE;

public class Main {
    public static void main(String[] args) {
       ObserverOrSubscriber mobile = new MobileDevice();
       ObserverOrSubscriber tv= new TVDevice();

       WeatherStation weatherStation = new WeatherStation();
       weatherStation.addObs(mobile);
       weatherStation.addObs(tv);
       weatherStation.setTemp("50 degrees");
       weatherStation.setTemp("60 degrees");
        


    }
}
