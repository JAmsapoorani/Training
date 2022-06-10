package controlStatement;
//Write a program using while loop to print Even numbers from 1 to 100.
public class evennumber {
    public static void main(String[] args)
    {
        int num=1;
        System.out.println("1 to 100 even number are : ");
        while(num++<=100)
        {
            if(num%2==0)
            {
                System.out.print(num+" ");
            }

        }
    }
}
