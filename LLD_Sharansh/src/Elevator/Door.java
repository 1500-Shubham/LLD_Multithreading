package Elevator;

public class Door {
    DoorState doorState;

    public Door() {
        this.doorState = DoorState.CLOSE;
    }

    public void openGate(int floor,int elevator){
        this.doorState=DoorState.OPEN;
        System.out.println("Elevator "+elevator+ "Opened at floor" + floor);
    }
    public void closeGate(int floor,int elevator){
        this.doorState=DoorState.CLOSE;
        System.out.println("Elevator "+elevator+ "Opened at floor" + floor);
    }


}
