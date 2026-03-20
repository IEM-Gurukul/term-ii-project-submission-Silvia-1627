package elevator.main;

import elevator.controller.ElevatorController;
import elevator.model.Elevator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();
        ElevatorController controller = new ElevatorController(elevator);

        Scanner sc = new Scanner(System.in);

System.out.print("Enter number of requests: ");
int n = sc.nextInt();

for (int i = 0; i < n; i++) {
    System.out.print("Enter floor: ");
    int f = sc.nextInt();
    controller.requestFloor(f);
}

sc.close();

    }
}