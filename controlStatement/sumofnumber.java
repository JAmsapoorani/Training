package controlStatement;
/*Write a program to calculate the sum of the numbers from 1 till upper bound.
If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

You should use while loop.*/

public class sumofnumber {
    public static void main(String[] args)
    {
        int num=1;
        int sum=0;
        while(num<=5)
        {
            sum+=num;
            num++;
        }
        System.out.println("sum of the number 1 to 5 ->"+sum);
        num=1;
        sum=0;
        while(num<=11)
        {
            sum+=num;
            num++;
        }
        System.out.println("sum of the number 1 to 11 ->"+sum);
        num=1;
        sum=0;
        while(num<=100)
        {
            sum+=num;
            num++;
        }
        System.out.println("sum of the number 1 to 100 ->"+sum);
    }
}
