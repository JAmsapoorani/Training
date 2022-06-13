package oopsconcepts;

public class A {
    public String str;
    public double val;
    A()
    {
        str="test1";
        val=23.0000;
    }
    A(String str)
    {
        this.str=str;
    }
    A(double val)
    {
        this.val=val;
    }
    A(String str,double val)
    {
        this.str=str;
        this.val=val;
    }
    public void print()
    {
        System.out.println("str:"+str+"\n val:"+val);
    }
}
