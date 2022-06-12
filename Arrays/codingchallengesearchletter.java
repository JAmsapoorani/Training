package Arrays;
/*Below is One-dimensional array code:
char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};

Write the code to search for particular character in above array.
If I search for 'B', then output should be: "B found!"
If I search for 'E', then output should be: "E Not found!" */

import java.util.Scanner;

public class codingchallengesearchletter {
    public static void main(String[] args)
    {
        char[] arr= new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the char value:");
        char value=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<8;i++)
        {
            if(arr[i]==value)
            {
                count++;
                break;
            }
        }
        if(count==1)
        {
            System.out.println(value+" found !");
        }
        else
        {
            System.out.println(value+" Not found !");
        }
    }
}
