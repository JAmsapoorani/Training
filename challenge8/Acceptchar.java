package challenge8;
/*
Question 1:
Write a program to ask user to enter either Y or N.
User can enter in lower case or upper case.
If user enters Y or y, then display “Welcome!” and terminate the program.
If user enters N or n, then display “Good Bye!” and terminate the program.
If user enters any other character, then display “Please provide correct input.” and ask user to enter
either Y or N.
If user enters more than one character such as yes/no/abc, then display “Please provide only one
character.” and ask user to enter either Y or N.
Program should not be terminated until user provides Y/y/N/n.
NOTE: Provide the solution under “challenge8” package and accept input as character
 */
import java.util.Scanner;
public class Acceptchar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("enter the char:");
        String str=sc.next();
        if(str.length()!=1)
        {
            System.out.println("Please provide only one character.");
            continue;
        }
        char ch=str.charAt(0);
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Welcome!");
                break;
            } else if (ch == 'N' || ch == 'n') {
                System.out.println("Good Bye!");
                break;
            } else {
                System.out.println("Please provide correct input.");
            }
        }
    }
}
