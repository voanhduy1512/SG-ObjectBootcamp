import org.junit.Assert;
import org.junit.Test;

public class DriverTest {
    @Test
    public void shouldSpeedUp(){
        Car car = new Car();
        Radio radio = new Radio();
        Driver driver = new Driver(car, radio);

        int current_speed = car.getSpeed();
        driver.speedUp();

        //assert car speed has increased
        Assert.assertTrue(car.getSpeed() > current_speed);
    }

    @Test
    public void shouldSlowDown(){
        Car car = new Car();
        Radio radio = new Radio();
        Driver driver = new Driver(car, radio);
        int current_speed = car.getSpeed();

        driver.slowDown();

        //assert car speed has decreased
        Assert.assertTrue(car.getSpeed() < current_speed);
    }

    @Test
    public void shouldTurnOnRadio(){
        Car car = new Car();
        Radio radio = new Radio();
        Driver driver = new Driver(car, radio);
        driver.listenToRadio();

        //assert radio is on
        Assert.assertTrue(radio.isTurnedOn());
    }

    @Test
    public void shouldTurnOffRadioToConcentrate(){
        Car car = new Car();
        Radio radio = new Radio();
        Driver driver = new Driver(car, radio);
        driver.listenToRadio();
        driver.concentrate();

        //assert radio is off
        Assert.assertFalse(radio.isTurnedOn());
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn(){
        Car car = new Car();
        Radio radio = new Radio();
        Driver driver = new Driver(car, radio);

        driver.listenToRadio();

        int current_volume = radio.getVolume();
        driver.listeningToFavouriteSong();

        //assert volume has increased
        Assert.assertTrue(radio.getVolume() > current_volume);
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger(){

        Car car = new Car();
        Radio radio = new Radio();
        Driver driver = new Driver(car, radio);

        driver.listenToRadio();

        int current_volume = radio.getVolume();
        driver.talkingToPassenger();

        //assert volume has decreased
        Assert.assertTrue(radio.getVolume() < current_volume);
    }

    @Test
    public void shouldDriveSportCarWithoutKnowIt(){

        Car sportCar = new SportCar();
        Radio radio = new Radio();

        //assert not throw exception, i miss Ruby now.
        Driver driver = new Driver(sportCar, radio);
    }
}
