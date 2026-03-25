package Elevator;

public class ExternalButton {
    ExternalDispatcher externalDispatcher;

    public ExternalButton(ExternalDispatcher externalDispatcher) {
        this.externalDispatcher = externalDispatcher;
    }

    public void pressButton(int floor, ElevatorDirection elevatorDirection){
        System.out.println("External button pressed for floor"+ floor + "move "+ elevatorDirection.name());
        this.externalDispatcher.submitExternalRequest(floor,elevatorDirection);
    }
}
