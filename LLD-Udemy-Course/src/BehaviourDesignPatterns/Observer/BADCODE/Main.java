package BehaviourDesignPatterns.Observer.BADCODE;

public class Main {
    public static void main(String[] args) {
        MobileDevice mobileDevice= new MobileDevice();
        WeatherStation weatherStation = new WeatherStation(mobileDevice);
        weatherStation.settemp("40degrees");
        weatherStation.settemp("50 degrees");



    }
}
