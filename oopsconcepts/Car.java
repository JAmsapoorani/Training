package oopsconcepts;

public class Car extends Engine {
    Engine engine;
    public Car(Engine engine)
    {
        this.engine=engine;
    }

    public void startCar()
    {
        engine.start();
        System.out.println("Car has Started.");
    }
    public void stopCar()
    {
        engine.stop();
        System.out.println("car has stopped.");
    }
}
