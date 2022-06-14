package stringcodingchallenge;

import ExceptionhandlingCodingChallenge.Search;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args)
    {
        String[] fullName={
                "Khattry,Udayan","Schildt,Herbert","Pitt,Brad","Hanks,Tom",};
        System.out.println("Printing Family Names:");
        printFamilyNames(fullName);
        System.out.println("****************************");
        System.out.println("Printing First names:");
        printFirstNames(fullName);
    }
    private static void printFamilyNames(final String[] names)
    {
        for (String n:names)
        {
            int index=n.indexOf(",");
            System.out.println(n.substring(0,index));
        }
    }
    private static void printFirstNames(final String[] names)
    {
        for (String n:names)
        {
            int index=n.indexOf(",");
            System.out.println(n.substring(index+1));
        }
    }
}
