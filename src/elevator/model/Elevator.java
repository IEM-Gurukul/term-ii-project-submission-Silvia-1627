package elevator.model;

public class Elevator {

    private int currentFloor;
    private String direction;

    public Elevator() {
        currentFloor = 0;
        direction = "IDLE";
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public String getDirection() {
        return direction;
    }

    public void moveToFloor(int floor) {
        System.out.println("Moving from " + currentFloor + " to " + floor);
        currentFloor = floor;
    }
}