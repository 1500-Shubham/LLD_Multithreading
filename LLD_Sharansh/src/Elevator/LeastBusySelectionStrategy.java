package Elevator;

import java.util.List;

public class LeastBusySelectionStrategy implements ElevatorSelectionStrategy{
    @Override
    public ElevatorController selectElevator(List<ElevatorController> elevatorControllers, int requestFloor, ElevatorDirection elevatorDirection) {
       int busy = Integer.MAX_VALUE;
        ElevatorController bestController = null;
        for(ElevatorController elevatorController : elevatorControllers)
        {
            if(busy > elevatorController.minPQ.size() + elevatorController.maxPQ.size()){
                busy = elevatorController.minPQ.size() + elevatorController.maxPQ.size();
                bestController = elevatorController;
            }
        }

        return bestController;
    }
}
