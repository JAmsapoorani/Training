package javaprogram;
class parent
{
    /*public void m1(Object o )
    {
        System.out.println("object");
    }*/
   public int m1(int s)
    {
        System.out.println("String");
        return 0;
    }
}
class child extends parent{
    /*public int m1(String s)
    {
        System.out.println("String1");
        return 0;
    }*/
    public int m1(int a)
    {
        System.out.println("integer value");
        return 0;
    }
}
public class MethodSignature {
    public static void main(String[] args)
    {
        parent p=new parent();
       // p.m1(null);
       parent p1=new child();
       short  a=12;
       // p1.m1(a);
        byte b=2;
        p1.m1(b);
       // p1.m1('A');
        child c=new child();
        c.m1('A');
    }

}
