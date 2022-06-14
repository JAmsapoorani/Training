package ExceptionhandlingCodingChallenge;

public class TestAnimal1 {
    public static void main(String[] args)
    {
        Animal[] animals=new Animal[2];
        animals[0]=new Dog();
        animals[1]=new Cat();
        test(animals);
    }
    public static void test(Animal[] animals)
    {
        if(animals!=null)
        {
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
