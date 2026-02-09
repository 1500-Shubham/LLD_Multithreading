package BehaviourDesignPatterns.State.GoodCode;

public class Walking implements TransportationMode{
    @Override
    public void getETA() {
        System.out.println("Walking ETA");
    }

    @Override
    public void getDirection() {
        System.out.println("Walking Direction");
    }
}
