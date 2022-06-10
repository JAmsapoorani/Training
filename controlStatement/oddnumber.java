package controlStatement;
/*Write a program for following logic:
Print all the odd numbers in comma separated form from 1 till end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if - else statements. Note that, there should not be any comma after last digit.*/
public class oddnumber {
    public static void main(String[] args)
    {
        int num=1;
        System.out.println("odd number 1 to 11:");
        while(num++<=11)
        {
            if(num%2!=0)
            {
                System.out.print(num + ",");
            }
        }
        System.out.println("\n odd number 1 to 10:");
        num=1;
        while(num++<10)
        {
            if(num%2!=0)
            {
                System.out.print(num + ",");
            }
        }
    }
}
