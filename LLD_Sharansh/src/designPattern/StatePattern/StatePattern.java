package designPattern.StatePattern;

interface TrafficState{
//    Red -> Green -> Yellow
    void next(TrafficContext trafficContext);
    String getColor();
}
class RedState implements TrafficState{

    @Override
    public void next(TrafficContext trafficContext) {
        System.out.println("RED State to Green State");
        trafficContext.currentState= new GreenState();
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
class GreenState implements TrafficState{

    @Override
    public void next(TrafficContext trafficContext) {
        System.out.println("Green State to Yellow State");
        trafficContext.currentState= new YellowState();
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
class YellowState implements TrafficState{

    @Override
    public void next(TrafficContext trafficContext) {
        System.out.println("Yellow State to Red");
        trafficContext.currentState= new RedState();
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}

class TrafficContext{
    TrafficState currentState;
    TrafficContext(){
        this.currentState = new RedState();
    }
    void next(){
        currentState.next(this);
    }
    String getState(){
        return currentState.getColor();
    }

}


public class StatePattern {

    public  static  void Main(){
        TrafficContext trafficContext = new TrafficContext();
        trafficContext.next();
        trafficContext.next();
        trafficContext.next();
        System.out.println(trafficContext.getState());
    }


}
