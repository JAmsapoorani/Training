package controlStatement;
/*
Print the table of 12 using for loop.
Output should be in following format:
12 X 1 = 12
12 X 2 = 24
12 X 3 = 36
12 X 4 = 48
12 X 5 = 60
12 X 6 = 72
12 X 7 = 84
12 X 8 = 96
12 X 9 = 108
12 X 10 = 120
 */
public class _12table {
    public static void main(String[] args)
    {
        int num=12;
        int sum;
        for(int i=1;i<=10;i++)
        {
         sum=num*i;
         System.out.println(num+"*"+i+"="+sum);
        }

        //using while loop
        int sum1;
        int i=1;
        System.out.println("-----------------");
        while(i<=10)
        {
            sum1=num*i++;
            System.out.println(num+"*"+i+"="+sum1);
        }
    }
}
