1- // Creational Design Patterns- e process of object creation or problems related to object creation. 
class Singleton{
    private static Singleton instance=null;
    public int data = 5;
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
            return instance;
        }else{
            return instance;
        }
    }
    
    // public static int getData(){
    //     return data;
    // }
}

2- // Factory  
// defines an interface for creating objects but lets subclasses decide which object to instantiate. It promotes loose coupling
abstract class Vehicle {
    public abstract void printVehicle();
}
class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}
class Client {
    private Vehicle pVehicle;

    public Client(int type) {
        if (type == 1) {
            pVehicle = new TwoWheeler();}}}
Client pClient = new Client(1);
        Vehicle pVehicle = pClient.getVehicle();



3- // Behavioral Design Patterns - communication between objects
// Observer Design Pattern is a behavioral pattern that establishes a one-to-many dependency between objects. When the subject changes its state, all its observers are automatically notified and updated.
// Publish–Subscribe Pattern (Pub-Sub)
// Observers( Users ) -> Notified Subjects(New Channel, Slack)
interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(String message);
}
interface Observer {
    void update(String message);
}
class NewsChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);
    }
     @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
    }
class User implements Observer {
     @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
NewsChannel channel = new NewsChannel();
 Observer u1 = new User("Alice");
        Observer u2 = new User("Bob");

        channel.register(u1);
        channel.register(u2);

        channel.publishNews("Breaking: Observer pattern explained!");