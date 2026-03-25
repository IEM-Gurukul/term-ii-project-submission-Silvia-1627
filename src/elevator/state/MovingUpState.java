package elevator.state;

import elevator.model.Elevator;

public class MovingUpState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {

        System.out.println("Elevator is Moving Up");

        while (elevator.getCurrentFloor() < floor) {
            int nextFloor = elevator.getCurrentFloor() + 1;
            elevator.moveToFloor(nextFloor);
        }

        System.out.println("Reached Floor " + floor);
System.out.println("Door Opening...");
System.out.println("Door Closing...");
System.out.println("Request completed successfully");
    }
}