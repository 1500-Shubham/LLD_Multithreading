package Elevator;

public class ElevatorCar {
    int id;
    int currentFloor;
    int nextStopage;
    ElevatorDirection elevatorDirection;
    Door door;

    public ElevatorCar(int id) {
        this.id = id;
        this.elevatorDirection = ElevatorDirection.IDLE;
        this.door = new Door();
    }

    public void moveElevator(int destinationFloor){
    //  Actually moving the elevator
    }
}
