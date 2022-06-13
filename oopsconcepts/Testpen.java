package oopsconcepts;
class Pen
{
    public String inkColor;
    public String brand="Parker";
    public Pen(String inkColor)
    {
        this.inkColor=inkColor;
    }
    public void getDetails()
    {
        System.out.println(brand+":"+inkColor);
    }
}
public class Testpen {
    public static void main(String[] args)
    {
        Pen p=new Pen("blue");
        Pen p1=new Pen("black");
        p.getDetails();
        p1.getDetails();
    }
}
