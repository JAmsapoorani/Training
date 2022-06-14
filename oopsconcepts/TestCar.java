package oopsconcepts;

public class TestCar {
    public static void main(String[] args)
    {
        Car car=new Car(new Engine());
        car.startCar();
        car.stopCar();
    }
}
