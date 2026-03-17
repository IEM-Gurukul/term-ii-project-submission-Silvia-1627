package elevator.state;

import elevator.model.Elevator;

public class IdleState implements State {

    @Override
    public void handleRequest(Elevator elevator, int floor) {

        System.out.println("Elevator is in Idle State");

        if (floor > elevator.getCurrentFloor()) {
            System.out.println("Switching to Moving Up State");
        } 
        else if (floor < elevator.getCurrentFloor()) {
            System.out.println("Switching to Moving Down State");
        } 
        else {
            System.out.println("Already at the requested floor");
        }
    }
}