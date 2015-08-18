public class Driver implements Alarmable {
    private Drivable tank;

    public Driver(Drivable tank) {

        this.tank = tank;
    }

    public void moveForward() {
        allStop();
        tank.increaseLeftSpeed();
        tank.increaseRightSpeed();
    }

    public void moveBackward() {
        allStop();
        tank.decreaseLeftSpeed();
        tank.decreaseRightSpeed();
    }

    public void allStop() {
        tank.stopLeft();
        tank.stopRight();
    }

    public void turnLeft() {
        allStop();
        tank.increaseRightSpeed();
        tank.decreaseLeftSpeed();
    }

    public void turnRight() {
        allStop();
        tank.increaseLeftSpeed();
        tank.decreaseRightSpeed();
    }

    @Override
    public void raiseAlarm() {
        tank.raiseAlarm();
    }
}
