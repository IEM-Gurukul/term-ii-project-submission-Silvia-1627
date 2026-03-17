package elevator.main;

import elevator.model.Elevator;
import elevator.model.Request;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();

        Request r1 = new Request(5);
        Request r2 = new Request(2);

        elevator.moveToFloor(r1.getFloorNumber());
        elevator.moveToFloor(r2.getFloorNumber());
    }
}