package ExceptionhandlingCodingChallenge;

import oopsconcepts.A;

public class TestAnimal {
    public static void main(String[] args)
    {
        Animal[] animals=null;
        test(null);
        animals=new Animal[2];
        test(animals);
    }
    private static void test(Animal[] animals)
    {
        if (animals != null) {
            for(Animal obj:animals)
            {
                if(obj!=null) {
                    obj.eat();
                    obj.sleep();
                }
            }
        }

    }
}
