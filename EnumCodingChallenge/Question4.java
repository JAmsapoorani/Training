package EnumCodingChallenge;

public class Question4 {
    enum Sports
    {
        Golf,Tennis,Cricket,Boxing;
    }
    public static void main(String[] args)
    {
        System.out.println(Sports.Golf.compareTo(Sports.Tennis));
        System.out.println(Sports.Cricket.compareTo(Sports.Golf));
        System.out.println(Sports.Tennis.compareTo(Sports.Boxing));
    }

}
