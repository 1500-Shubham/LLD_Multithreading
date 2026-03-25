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
        this.currentFloor=0;
        this.nextStopage=0;
    }

    private void showDisplay(){
        System.out.println("Moving elevator "+ this.id+ "Current Floor "+ this.currentFloor + "Moving" + this.elevatorDirection);
    }

    public void moveElevator(int destinationFloor) throws InterruptedException {
//    This is pojo it means a request comes it will go to that place
        if(this.currentFloor == destinationFloor) {
            this.elevatorDirection = ElevatorDirection.IDLE;
            this.door.openGate(this.currentFloor,this.id);
            showDisplay();
            return;
        }

        this.nextStopage = destinationFloor;
        this.door.closeGate(this.currentFloor,this.id);
//        Not it will go to that place
        if(this.currentFloor < destinationFloor){
//            Move up
            this.elevatorDirection = ElevatorDirection.UP;
            for(int i=this.currentFloor+1;i<=destinationFloor;++i){
                this.currentFloor=i;
                showDisplay();
                Thread.sleep(500);
            }

        }else{
            this.elevatorDirection = ElevatorDirection.DOWN;
            for(int i=this.currentFloor+1;i>=destinationFloor;--i){
                this.currentFloor=i;
                showDisplay();
                Thread.sleep(500);
            }
        }
        this.door.openGate(this.currentFloor,this.id);
//        elevator actually moved to that floor using nextStoppage
    }
}
