package Arrays;
/* In mathematics, the Fibonacci series are the numbers in the following integer sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
and each subsequent number is the sum of the previous two.

Write a Java Program to generate above series till n number of times (For example you can try with
n = 10 and n = 15) and store it in One-dimensional array.
For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

Write a for loop to print all the elements of the array. */

import java.util.Scanner;

public class fibonacciseriescoding {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int[] series=new int[num];
       series[0]=0;
       series[1]=1;
        System.out.print(series[0]+", "+series[1]);
        for(int i=2;i<num;i++)
        {
            series[i]=series[0]+series[1];
            System.out.print(series[i]+", ");
            series[0]=series[1];
            series[1]=series[i];
        }

    }
}
