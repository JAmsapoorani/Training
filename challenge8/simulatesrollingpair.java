package challenge8;

import java.security.SecureRandom;
import java.util.Scanner;

/*
Write a program that simulates rolling a pair of dice. Roll of 1st die will give a number between 1 and
6. Roll of 2nd die will also give a number between 1 and 6. You can use java.security.SecureRandom
class to get the numbers for both the dice. Their sum can be number between 2 and 12.
At the start ask the user to guess a number between 2 and 12. Then roll both the dice and if their
sum matches with the guessed number then we have a winner. Display greetings and exit the
program.
But if their sum doesn’t match, then ask user, if he would like to play again. If his answer is n, then
exit the program but if his answer is y then re-run the same logic.
Your output should match with below output
 */
public class simulatesrollingpair {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        SecureRandom rn = new SecureRandom();
        while(true) {
            System.out.print("Guess a number between 2 and 12: ");
            int num = scanner.nextInt();
            if (num < 2 || num > 12) {
                continue;
            }
            System.out.println("To win you have to score:"+num);
            System.out.print("Press Enter to roll the dice...\n");
            int dice1=rn.nextInt(6)+1;
            int dice2=rn.nextInt(6)+1;
            int sum=dice1+dice2;
            if(sum==num)
            {
                System.out.println("Congratulations!!!! Collect prize money at the counter.");
                break;
            }
            else {
                System.out.print("Your score: " + sum + ". Sorry you lost, would you like to play again? (y/n): ");
                String str = scanner.next();
                if (!str.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }
    }
}
