package oopsconcepts;

public class TestPerson {
    public static void main(String[] args)
    {
        Person p1=new Person("udayan","Khattry");
        Person p2=new Person("UDAYAN","KHATTRY");
        Person p3=new Person("udayan","khattry");
        Person p4=new Person("udayn","Khatry");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
    }
}
