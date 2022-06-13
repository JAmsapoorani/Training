package oopsconcepts;

import java.util.Scanner;

public class OpenTheDoor {
    public static void main(String[] args) {
        Electronics [] doors = new Electronics[3];
        doors[0] = new Camera();
        doors[1] = new Television("Star Sports");
        doors[2] = new SmartPhone();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select one door (1/2/3): ");
        int doorNum = sc.nextInt() - 1;
        if(doorNum < 0 || doorNum > 2) {
            System.out.println("You have not provided correct door number. Exiting....");
            System.exit(-1);
        }
        Electronics elec = doors[doorNum];
        elec.powerOn();
        System.out.println("Switched On? " + elec.isOn());
        elec.operate();
        elec.powerOff();
        System.out.println("Switched On? " + elec.isOn());
    }
}
