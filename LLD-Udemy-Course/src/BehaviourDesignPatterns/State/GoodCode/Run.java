package BehaviourDesignPatterns.State.GoodCode;

public class Run  implements  TransportationMode{
    @Override
    public void getETA() {
        System.out.println("run ETA");
    }

    @Override
    public void getDirection() {
        System.out.println("run direction");
    }
}
