package javaprogram;
class P1
{
    public void m1(Object o)
    {
        System.out.println("parent class");
    }

}
class C1 extends P1{
    public void m1(String o)
    {
        System.out.println("child class1");
    }
}
public class Overridingrules {
    public static void main(String[] args)
    {
        P1 p=new P1();
        p.m1(null);
        C1 c=new C1();
        c.m1(null);
        P1 p1=new C1();
        p1.m1(null);
    }
}
