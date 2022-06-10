package controlStatement;
/* swithcase to print even or odd for the numbers*/
public class codingchallenge1 {
    public static void main(String args[])
    {
        int num=8;
        int result=num%2;
        switch (result)
        {
            case 0:
                System.out.println("even number");
                break;
            default:
                System.out.println("odd number");
        }
        if(result==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }

    }
}
