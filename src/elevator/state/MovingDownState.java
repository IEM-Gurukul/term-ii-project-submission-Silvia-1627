package elevator.state;

import elevator.model.Elevator;

public class MovingDownState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {

        System.out.println("Elevator is Moving Down");

        while (elevator.getCurrentFloor() > floor) {
            int nextFloor = elevator.getCurrentFloor() - 1;
            elevator.moveToFloor(nextFloor);
        }

        System.out.println("Reached Floor " + floor);
    }
}