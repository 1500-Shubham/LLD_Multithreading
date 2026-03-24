package Elevator;

import java.util.List;

public class ElevatorScheduler {
    List<ElevatorController> elevatorControllers;
    ElevatorSelectionStrategy elevatorSelectionStrategy;

    public ElevatorScheduler(List<ElevatorController> elevatorControllers, ElevatorSelectionStrategy elevatorSelectionStrategy) {
        this.elevatorControllers = elevatorControllers;
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public void setStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy){
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public ElevatorController assignElevator(int floor, ElevatorDirection elevatorDirection){
        return  null;
    }

}
