package elevator.main;

import elevator.model.Elevator;
import elevator.controller.ElevatorController;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();
        ElevatorController controller = new ElevatorController(elevator);

        controller.requestFloor(5);
        controller.requestFloor(2);
        controller.requestFloor(7);

    }
}