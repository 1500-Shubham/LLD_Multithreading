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
//        Step2
        System.out.println("Elevator "+ bestController.elevatorCar.id +"Selected for floor"+floor + "moving "+ direction.name());
        bestController.submitRequest(floor);
    }
}
