import org.junit.Assert;
import org.junit.Test;

public class SportCardTest {
    @Test
    public void shouldAccelerateByStepOf2(){
        Car car = new Car();
        int current_speed = car.getSpeed();

        car.accelerate();

        Assert.assertEquals(2, car.getSpeed() - current_speed);
    }

    @Test
    public void shoulddecelerateByStepOf2(){
        Car car = new Car();
        car.accelerate();
        int current_speed = car.getSpeed();

        car.decelerate();

        Assert.assertEquals(2, car.getSpeed() - current_speed);
    }
}
