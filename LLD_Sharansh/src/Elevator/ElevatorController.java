package Elevator;

import java.util.Collections;
import java.util.PriorityQueue;

public class ElevatorController {
    ElevatorCar elevatorCar;
    PriorityQueue<Integer> minPQ;
    PriorityQueue<Integer> maxPQ;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        minPQ= new PriorityQueue<>();
        maxPQ =new PriorityQueue<>(Collections.reverseOrder());
    }

    public  void submitRequest(int destinationFloor){
    // based on elevatorCar we will add to queue
    }
}
