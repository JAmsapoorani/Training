package javaprogram;
class p1
{
   String s="parent";
}
class c1 extends p1
{
    String s="child";
}
public class OverridingWrtVariables {
    public static void main(String[] args)
    {
        p1 p=new p1();
        System.out.println(p.s);
        c1 c=new c1();
        System.out.println(c.s);
        p1 p1=new c1();
        System.out.println(p1.s);
    }
}
