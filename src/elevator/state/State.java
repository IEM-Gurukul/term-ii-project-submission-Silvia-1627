package elevator.state;

import elevator.model.Elevator;

public interface State {

    void handleRequest(Elevator elevator, int floor);

}