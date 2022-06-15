package Collection;

import oopsconcepts.A;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        ArrayList alist=new ArrayList(30);
        al.add("john");
        al.add(true);
        al.add(10);
        System.out.println(al);
        al.remove(new Integer(10));
        System.out.println(al);
        System.out.println(al.get(1));
    }
}
