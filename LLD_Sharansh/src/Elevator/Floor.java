package Elevator;

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
        this.upButton.pressButton(this.floorNumber,ElevatorDirection.UP);

    }
    public void pressDownButton(){
        this.downButton.pressButton(this.floorNumber,ElevatorDirection.DOWN);
    }

}
