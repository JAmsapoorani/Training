package javaprogram;
class p
{
    public void m1()
    {
        System.out.println("parent class method");
    }
}
class c extends p{
    public void m2()
    {
        System.out.println("child class method");
    }
}
public class Test {
    public static void main(String[] args)
    {
        p p1=new p();
        p1.m1();
       // p1.m2();
        p p2=new c();
        p2.m1();
        //p2.m2();
        c c1=new c();
        c1.m2();
        c1.m1();
       // c c2=new p();
       // c2.m2();
       // c2.m1();
    }



}
