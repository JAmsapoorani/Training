package javaprogram;
class Methodoverloading
{
   public int over(int a)
   {
       System.out.println("method 1");
       return a;
   }
   public int over(String s)
   {
       System.out.println("method2");
       return 0;
   }
   public void over(double d)
   {
       System.out.println("method 3");
   }

}
public class Overloading {
    public static void main(String[] args)
    {
        Methodoverloading m=new Methodoverloading();
        m.over('A');
        byte b=12;
        m.over(b);
        short s=1;
        m.over(s);
        m.over(2.3); // double
        m.over(123l); //long
        m.over(0.34f);// float
        m.over(100); //int


    }
}
