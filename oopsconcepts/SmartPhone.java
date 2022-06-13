package oopsconcepts;

public class SmartPhone extends Electronics {
    public void operate() {
        if (isOn()) {
            System.out.println("Place a call");
        } else {
            System.out.println("Switch on you Smart Phone");
        }
    }
}
