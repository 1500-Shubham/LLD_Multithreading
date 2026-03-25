package Elevator;

public class InternalButton {
    ElevatorController elevatorController;
//    Inside each elevator has its own internalButton
    public InternalButton(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    public void pressButton(int floor){
//        Directly invoke the elevator controller
        System.out.println("Internal button pressed for elevator"+ elevatorController.elevatorCar.id+ "for floor"+ floor);
        elevatorController.submitRequest(floor);
    }
}
