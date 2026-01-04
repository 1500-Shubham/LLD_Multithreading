package designPattern;

import java.util.ArrayList;
import java.util.List;

interface ObservableInterface{
 void add(Observer o);
 void remove(Observer o);
 void notifyObserver();
 void setData(int d);
 int getData();
}
class WeatherStationObservable implements ObservableInterface{
    List<Observer> observers = new ArrayList<>();
    int temp=0;

    @Override
    public void add(Observer o){
        observers.add(o);
    }
    @Override
    public  void remove(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObserver(){
        for(Observer o : observers){
            o.update();
        }
    }
    @Override
    public void setData(int d){
        this.temp=d;
        this.notifyObserver();
    }
    @Override
    public int getData(){
        return this.temp;
    }
}

interface Observer{
    void update();
}
class MobileDisplayObserver implements Observer{
    ObservableInterface obj;
    MobileDisplayObserver(ObservableInterface obj){
        this.obj=obj;
    }
    @Override
    public void update(){
        System.out.println("NEW Updated data inside MobileDisplayObserver"+obj.getData());
    }
}
class TVDisplayObserver implements Observer{
    ObservableInterface obj;
    TVDisplayObserver(ObservableInterface obj){
        this.obj=obj;
    }
    @Override
    public void update(){
        System.out.println("NEW Updated data inside TVDisplayObserver"+obj.getData());
    }
}


public class ObserverPattern {

    public static  void Main(){
        ObservableInterface weatherStation = new WeatherStationObservable();
        Observer mobile= new MobileDisplayObserver(weatherStation);
        Observer tv= new TVDisplayObserver(weatherStation);
        weatherStation.add(mobile);
        weatherStation.add(tv);
        weatherStation.setData(5);
    }


}
