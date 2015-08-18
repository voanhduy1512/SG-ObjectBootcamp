/**
 * Created by anhduyvo on 18/8/15.
 */
public interface Firable extends Alarmable {
    int getGunAngle();

    int getGunRake();

    void rotateGunLeft();

    void rotateGunRight();

    void raiseGun();

    void lowerGun();

    void fire() throws OutOfShellsException;
}
