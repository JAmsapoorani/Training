package controlStatement;
/*Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
which are divisible by 5.*/
public class divisibleby5 {
    public static void main(String[] args)
    {
        System.out.println("1 to 100 divisible by 5 number :");
        for(int i=1;i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.print(i+",");
            }
        }
    }
}
