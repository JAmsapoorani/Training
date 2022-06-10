package controlStatement;

public class ifelseifprogram {
    public static void main(String args[])
    {
        byte hour=14;
        if(hour<12)
        {
            System.out.println("Good Morning");
        }
        else if(hour<16) // or hour>=12 && hour<16
        {
            System.out.println("Good Afternoon");
        }
        else {
            System.out.println("Good Evening");
        }
    }
}
