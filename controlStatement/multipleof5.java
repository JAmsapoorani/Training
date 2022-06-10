package controlStatement;
/*
Print the multiples of 5 starting from 200 to 5 with following restrictions:
1. Use for loop
2. Don't use modulus (%) operator to check whether number is divisible by 5 or not.
 */
public class multipleof5 {
    public static void main(String[] args)
    {
        for(int i=200;i>=5;i--)
        {
            if(i%5==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int num=7,i=1,mul=5;
        int sum;
        boolean flag=true;
        while(i<num)
        {
            sum=i* mul;
            if (num==sum) {
               flag=true;
               break;
            } else {
                flag=false;
            }
            i++;
        }
        if(flag)
        {
            System.out.println(num+" is multiple by 5");
        }
        else
        {
            System.out.println(num+" is not multiple by 5");
        }

    }

}
