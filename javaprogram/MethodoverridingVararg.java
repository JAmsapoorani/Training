package javaprogram;
class Par
{
    public void m1(int... o)
    {
        System.out.println("parent class");
    }

}
class Chi extends Par{
    public void m1(int o)
    {
        System.out.println("child class1");
    }
}
public class MethodoverridingVararg {  //over loading not overriding
    public static void main(String[] args)
    {
        Par p=new Par();
        p.m1(10);
        Chi c=new Chi();
        c.m1(10);
        Par p1=new Chi();
        p1.m1(10);
    }
}
