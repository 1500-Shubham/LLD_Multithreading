package BehaviourDesignPatterns.State.BADCODE;

enum TransportationMode{
    WALKING, RUN
}

class DirectionService{
    private  TransportationMode tm;

    DirectionService(TransportationMode tm){
        this.tm = tm;
    }

    void setMode(TransportationMode tm){
        this.tm = tm;
    }

    void getETA(){
        switch (tm) {
            case WALKING:
                System.out.println("WALKing ETA");
                return;
            case RUN:
                System.out.println("Running ETA");
                return;
            default:
                System.out.println("Unknown ETA");
        }
    }
    void getDirection(){
        switch (tm) {
            case WALKING:
                System.out.println("WALKing Direction");
                return;
            case RUN:
                System.out.println("Running Direction");
                return;
            default:
                System.out.println("Unknown Direction");
        }
    }
    }




public class WithoutState {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.RUN);
        directionService.setMode(TransportationMode.WALKING);

        directionService.getETA();
        directionService.getDirection();
    }
}
