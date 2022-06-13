package oopsconcepts;

import java.util.Arrays;

/*
Write a method that takes an int [] as a parameter and sorts the array elements in ascending order.
For example, if an int array object has elements {8, 1000, -10, 76, 276} and we pass it to the method,
then method will correct the element order in the array as: {-10, 8, 76, 276, 1000}.
 */
/*
question :2
Same as Question 1. java.util.Arrays class has various utility methods to work with Arrays.
Instead of writing your own logic to sort the passed int [] object in the method, you have to use a
method from java.util.Arrays class to solve it.
 */
class AscendingOrder
{
    public static int[] order(int[] num)
    {
        int temp;
        for (int i=0;i<num.length;i++)
        {
            for (int j = i + 1; j < num.length; j++)
            {
              if(num[i]>num[j])
              {
                temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                }
            }
        }
       return num;
    }
    public static int[] order1(int[] num)
    {
       Arrays.sort(num);
       return num;
    }
}
public class codingchallengemethod {
    public static void main(String[] args)
    {
        int[] num=new int[]{8,1000,-10,76,276};
        int[] sort=AscendingOrder.order(num);
        System.out.println("Ascending order :");
        for (int s:sort)
        {
            System.out.print(s+",");
        }
        int[] Arraysort=AscendingOrder.order1(num);
        System.out.println("\n Ascending order using Arrays.sort:");
        for (int s1:Arraysort)
        {
            System.out.print(s1+",");
        }
    }
}
