package oopsconcepts;

import java.util.concurrent.Callable;

public class Circus {
    public static void doTrick(Animal animal)
    {
        animal.walk();
        if(animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.wagTail();
        }
        if(animal instanceof Cat) {
            Cat c = (Cat) animal;
            c.jump();
        }
    }
    public static void main(String[] args)
    {
        Animal a1=new Animal();
        Circus.doTrick(a1);
        Animal a2=new Dog();
        Circus.doTrick(a2);
        Animal a3=new Cat();
        Circus.doTrick(a3);
    }
}
