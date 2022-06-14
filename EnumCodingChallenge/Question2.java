package EnumCodingChallenge;

import oopsconcepts.Point;

import java.security.PublicKey;
import java.util.Locale;

public class Question2 {
    enum Direction
    {
        NORTH,EAST,WEST,SOUTH;
    }
    public static void main(String[] args)
    {
        Direction[] arr=Direction.values();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i].name().toUpperCase().charAt(0));
        }
    }
}

