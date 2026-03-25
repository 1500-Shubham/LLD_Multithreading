package Elevator;

import java.sql.SQLOutput;

public class Floor {
    ExternalButton upButton;
    ExternalButton downButton;
    int floorNumber;

    public Floor(int floorNumber, ExternalDispatcher globalExternalDispatcher) {
        this.floorNumber = floorNumber;
        upButton = new ExternalButton(globalExternalDispatcher);
        downButton = new ExternalButton(globalExternalDispatcher);
    }

    public void pressUpButton(){
        System.out.println("Floor UP button pressed" + this.floorNumber);
        this.upButton.pressButton(this.floorNumber,ElevatorDirection.UP);

    }
    public void pressDownButton(){
        System.out.println("Floor Down button pressed" + this.floorNumber);
        this.downButton.pressButton(this.floorNumber,ElevatorDirection.DOWN);
    }

}
