package Elevator;

import java.util.List;

public class NearestSelectionStrategy implements ElevatorSelectionStrategy{
    @Override
    public ElevatorController selectElevator(List<ElevatorController> elevatorControllers, int requestFloor, ElevatorDirection elevatorDirection) {
//       I need to select elevator
//        Firstly same direction move elevator and shortest distance
        int dist  = Integer.MAX_VALUE;
        ElevatorController bestController = null;
        for(ElevatorController elevatorController : elevatorControllers){
            if(elevatorController.elevatorCar.elevatorDirection == elevatorDirection){
                if(dist > Math.abs(elevatorController.elevatorCar.currentFloor - requestFloor)){
                    bestController = elevatorController;
                }
            }
        }
//        If no same direction then select the idle one
        for(ElevatorController elevatorController : elevatorControllers){
            if(elevatorController.elevatorCar.elevatorDirection == ElevatorDirection.IDLE){
                bestController= elevatorController;
                break;
            }
        }
//        If on idle and not in same direction
        if(bestController != null)
            bestController = elevatorControllers.get(0);

        return bestController;
    }
}
