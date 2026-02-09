package BehaviourDesignPatterns.Observer.BADCODE;

public class WeatherStation {
    private MobileDevice mobileDevice;
//    tigh Coupling with class loose coupling need interface

    public WeatherStation(MobileDevice mobileDevice){
        this.mobileDevice = mobileDevice;
    }

    void settemp(String temp){
        System.out.println("New Temperature is " + temp);
        notify(temp);
    }

    void notify(String tmep){
           this.mobileDevice.showTemp(tmep);
    }


}
