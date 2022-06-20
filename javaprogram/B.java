package javaprogram;
import First.A;
public class B extends A{
    public static void main(String[] args)
    {
        A a=new A();
       // a.display();
        B b=new B();
        b.display();
        A a1=new B();
        //a1.display();
    }
}
