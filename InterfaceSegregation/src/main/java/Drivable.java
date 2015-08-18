/**
 * Created by anhduyvo on 18/8/15.
 */
public interface Drivable extends Alarmable {
    int getLeftSpeed();

    int getRightSpeed();

    int getRemainingShells();

    void stopLeft();

    void stopRight();

    void increaseLeftSpeed();

    void decreaseLeftSpeed();

    void increaseRightSpeed();

    void decreaseRightSpeed();
}
