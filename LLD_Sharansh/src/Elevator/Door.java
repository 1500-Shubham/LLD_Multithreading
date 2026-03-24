package Elevator;

public class Door {
    DoorState doorState;

    public Door() {
        this.doorState = DoorState.CLOSE;
    }

    public void openGate(){
        this.doorState=DoorState.OPEN;
    }
    public void closeGate(){
        this.doorState=DoorState.CLOSE;
    }


}
