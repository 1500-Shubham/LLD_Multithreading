package Elevator;

public class ExternalDispatcher {
//    For external button usage
    ElevatorScheduler elevatorScheduler;

    public ExternalDispatcher(ElevatorScheduler elevatorScheduler) {
        this.elevatorScheduler = elevatorScheduler;
    }


    public void submitExternalRequest(int floor, ElevatorDirection direction){
//        Step1
        ElevatorController bestController = elevatorScheduler.assignElevator(floor,direction);
        bestController.submitRequest(floor);
    }
}
