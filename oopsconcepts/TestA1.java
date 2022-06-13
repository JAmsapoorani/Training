package oopsconcepts;
class A2
{
    public int n1;
    public int n2;
    public A2(int n1,int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    static
    {
        System.out.println("Loaded A class template...");
    }
    public void print()
    {
        System.out.println("("+n1+","+n2+")");
    }
}
public class TestA1 {
    public static void main(String[] args)
    {
        A2 a=new A2(0,0);
        A2 b=new A2(1,1);
        A2 c=new A2(2,2);
        a.print();
        b.print();
        c.print();
    }
}
