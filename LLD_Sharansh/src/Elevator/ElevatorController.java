package Elevator;

import javax.management.monitor.Monitor;
import java.util.Collections;
import java.util.PriorityQueue;

public class ElevatorController implements Runnable {
    ElevatorCar elevatorCar;
    PriorityQueue<Integer> minPQ;
    PriorityQueue<Integer> maxPQ;
    private final Object monitor = new Object();
    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        minPQ= new PriorityQueue<>();
        maxPQ =new PriorityQueue<>(Collections.reverseOrder());
    }

    public  void submitRequest(int destinationFloor){
    // based on elevatorCar direction and current floor status we will add to queue
//       Elevator car - current Floor, nextStop, direction
        System.out.println("Elevator "+ this.elevatorCar.id +" accepted request to go to" + destinationFloor);
        if(destinationFloor == this.elevatorCar.nextStopage){
//            elevator will be going to this place
            return;
        }

        if(destinationFloor > this.elevatorCar.nextStopage){
//            upar jaega baad mein
            if(!minPQ.contains(destinationFloor))
                minPQ.add(destinationFloor);
        }else{
            if(!maxPQ.contains(destinationFloor))
                maxPQ.add(destinationFloor);
        }
        synchronized (monitor){
            monitor.notify();
        }

    }

    @Override
    public void run() {
//        Make this elevator run infinite
        try {
            controlElevator();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void controlElevator() throws InterruptedException {
        while(true){

            synchronized (monitor){
//                Whenver a request adds to Queue this will start
            while(minPQ.size() + maxPQ.size() ==0 ){
//                No request for this lift
                System.out.println("Elevator"+ this.elevatorCar.id+" is in IDLE");
                this.elevatorCar.elevatorDirection = ElevatorDirection.IDLE;
                monitor.wait();
                }

            }

            while(!minPQ.isEmpty()){
                int targetFloor = minPQ.poll();
                System.out.println("Serving floor: " + targetFloor + " by elevator:" + this.elevatorCar.id + " currentFloor: " + this.elevatorCar.currentFloor);
                this.elevatorCar.moveElevator(targetFloor);
            }

            while(!maxPQ.isEmpty()){
                int targetFloor = maxPQ.poll();
                System.out.println("Serving floor: " + targetFloor + " by elevator:" + this.elevatorCar.id + " currentFloor: " + this.elevatorCar.currentFloor);
                this.elevatorCar.moveElevator(targetFloor);
            }

        }
    }


}
