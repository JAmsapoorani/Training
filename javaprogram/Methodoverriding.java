package javaprogram;
class P
{
    public void marry()
    {
        System.out.println("Parent marry method");
    }
}
class C extends P
{
    public void marry()
    {
        System.out.println("child marry method");
    }
}
public class Methodoverriding {
    public static void main(String[] args)
    {
        P p=new P();
        p.marry();
        C c=new C();
        c.marry();
        P p1=new C();
        p1.marry();
    }
}
