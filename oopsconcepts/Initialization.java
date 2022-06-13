package oopsconcepts;

public class Initialization {
    {
        System.out.println(5);
    }
    static
    {
        System.out.println(4);
    }

    public static void main(String[] args) {
        Initialization i = new Initialization();
    }
}
