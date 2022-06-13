package oopsconcepts;
class A1
{
    int num1;
    int num2;
    public void print(int num1,int num2)
    {
        System.out.println("num1:"+num1+" num2:"+num2);
    }

}
public class Codingchallenge10 {
    public static void main(String[] args)
    {
        A1 a=new A1();
        byte b1=5;
        byte b2=10;
        a.print(b1,b2);
        short s1=100;
        short s2=200;
        a.print( s1,s2);
        int i1=1000;
        int i2=2000;
        a.print(i1,i2);
    }
}
