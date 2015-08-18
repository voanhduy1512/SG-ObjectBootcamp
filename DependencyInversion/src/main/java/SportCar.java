public class SportCar extends Car {
    @Override
    public void accelerate() { speed += 2; }

    @Override
    public void decelerate() { if(speed > 0) speed -= 2; }
}
