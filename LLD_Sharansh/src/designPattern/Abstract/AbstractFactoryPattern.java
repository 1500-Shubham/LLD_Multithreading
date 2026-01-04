package designPattern.Abstract;


import java.util.Vector;

interface Vehicle{
    void average();
}

class LuxuryBMW implements Vehicle {
    @Override
    public void average(){
        System.out.println("BMW draw");
    }
}

class LuxuryMercedes implements Vehicle{
    @Override
    public void average(){
        System.out.println("LuxuryMercedes draw");
    }
}
class OrdinarySwift implements Vehicle{
    @Override
    public void average(){
        System.out.println("OrdinarySwift draw");
    }
}
class OrdinaryAlto implements Vehicle{
    @Override
    public void average(){
        System.out.println("OrdinaryAlto draw");
    }
}

interface VehicleFactory{
    Vehicle getVehicle(String input);
}
class LuxuryFactory implements  VehicleFactory{
    @Override
    public  Vehicle getVehicle(String input){
        switch (input){
            case "BMX": return new LuxuryBMW();
            default: return new LuxuryMercedes();
        }
    }
}
class OrdinaryFactory implements  VehicleFactory{
    @Override
    public  Vehicle getVehicle(String input){
        switch (input){
            case "Swift": return new OrdinarySwift();
            default: return new OrdinaryAlto();
        }
    }
}

class Factory2{
   public static VehicleFactory getVehicleFactory(String input){
        switch (input){
            case "Luxury": return new LuxuryFactory();
            default: return new OrdinaryFactory();
        }
    }
}



public class AbstractFactoryPattern
{
//    Factory Of Factory
    public static void Main(){
        VehicleFactory vehicleFactory = Factory2.getVehicleFactory("Luxury");
        Vehicle v = vehicleFactory.getVehicle("BMX");
        v.average();
    }
}
