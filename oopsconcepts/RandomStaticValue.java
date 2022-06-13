package oopsconcepts;

import java.security.SecureRandom;

public class RandomStaticValue {
    public static int value;

    static {
        SecureRandom rs=new SecureRandom();
        value=rs.nextInt(7);
    }
    public static void main(String[] args)
    {
        System.out.println("Random value between 1 and 6 is :"+value);
    }
}
