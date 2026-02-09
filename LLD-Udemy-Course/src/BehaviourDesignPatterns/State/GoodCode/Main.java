package BehaviourDesignPatterns.State.GoodCode;

public class Main {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Walking());
        directionService.setMode(new Run());
        directionService.getDirection();
        directionService.getETA();
    }
}
