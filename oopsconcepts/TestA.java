package oopsconcepts;

public class TestA {
public static void main(String[] args)
{
    A a1=new A();
    a1.print();
    A a2=new A("test");
    a2.print();
    A a3=new A(25.2345);
    a3.print();
    A a4=new A("test2",11.0054);
    a4.print();
}
}
