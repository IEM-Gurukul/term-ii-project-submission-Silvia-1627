package elevator.controller;

import elevator.model.Elevator;
import elevator.state.*;
import java.util.LinkedList;
import java.util.Queue;

public class ElevatorController {

    private Elevator elevator;
    private State state;
    private Queue<Integer> requestQueue = new LinkedList<>();

    // Constructor
    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        this.state = new IdleState(); // default state
    }

    // Method to handle floor request
    public void requestFloor(int floor) {

        System.out.println("\nRequest received for floor: " + floor);
    
        requestQueue.add(floor);
    
        while (!requestQueue.isEmpty()) {
            int f = requestQueue.poll();
    
            if (f > elevator.getCurrentFloor()) {
                state = new MovingUpState();
            } 
            else if (f < elevator.getCurrentFloor()) {
                state = new MovingDownState();
            } 
            else {
                state = new IdleState();
            }
    
            state.handleRequest(elevator, f);
        }
    }
}