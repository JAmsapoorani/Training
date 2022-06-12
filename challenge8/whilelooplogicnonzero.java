package challenge8;

import java.util.Scanner;

/*
Write a program to accept an int value from the user until user provides 0.
Display the same value in the output.
For non-zero values, re-run the logic.
NOTE: Use of while loop is must in the logic
 */
//while loop
public class whilelooplogicnonzero {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("Enter 0 to exit:");
            int num=sc.nextInt();
            if (num == 0) {
                System.out.println("your entered:" + num);
                break;
            }
            else {
                System.out.println("your entered:" + num);
            }
        }
        //do while
        do {
            System.out.println("Enter 0 to exit:");
            int num=sc.nextInt();
            if (num == 0) {
                System.out.println("your entered:" + num);
                break;
            }
            else {
                System.out.println("your entered:" + num);
            }

        }while(true);
    }
}
