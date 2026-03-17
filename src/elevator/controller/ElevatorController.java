package elevator.controller;

import elevator.model.Elevator;
import elevator.state.*;

public class ElevatorController {

    private Elevator elevator;
    private State state;

    // Constructor
    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        this.state = new IdleState(); // default state
    }

    // Method to handle floor request
    public void requestFloor(int floor) {

        System.out.println("\nRequest received for floor: " + floor);

        if (floor > elevator.getCurrentFloor()) {
            state = new MovingUpState();
        } 
        else if (floor < elevator.getCurrentFloor()) {
            state = new MovingDownState();
        } 
        else {
            state = new IdleState();
        }

        state.handleRequest(elevator, floor);
    }
}