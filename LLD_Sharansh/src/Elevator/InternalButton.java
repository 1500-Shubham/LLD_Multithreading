package Elevator;

public class InternalButton {
    ElevatorController elevatorController;
//    Inside each elevator has its own internalButton
    public InternalButton(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    public void pressButton(int floor){
//        Directly invoke the elevator controller
        elevatorController.submitRequest(floor);
    }
}
