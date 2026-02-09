package BehaviourDesignPatterns.State.GoodCode;

public class DirectionService {
    TransportationMode tm;

    DirectionService(TransportationMode tm){
        this.tm= tm;
    }
    void setMode(TransportationMode tm){
        this.tm= tm;
    }

    void getETA(){
        this.tm.getETA();
    }

    void getDirection(){
        this.tm.getDirection();
    }
}
