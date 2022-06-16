package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetpro {
    public static void main(String[] args)
    {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("A");
        lhs.add("F");
        System.out.println(lhs.contains("B"));
        System.out.println(lhs);
        System.out.println(lhs.remove("C"));
        System.out.println(lhs);
        System.out.println(lhs.contains("C"));

    }
}
