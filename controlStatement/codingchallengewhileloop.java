package controlStatement;
//Use pre-decrement operator in while's boolean_expression to print HELLO 5 times on to the console.
public class codingchallengewhileloop {
    public static void main(String[] args)
    {
        int i=0;
        while (++i<=5) //pre increment
        {
            System.out.println("HELLO");
        }
        int i1=5;
        while(--i1>=0)  //pre decrement
        {
            System.out.println("HELLO1");
        }
    }
}
