package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsetelement {
    public static void main(String[] args)
    {
        SortedSet s=new TreeSet();
        s.add(10);
        s.add(11);
        s.add(1);
        s.add(3);
        s.add(8);
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.tailSet(8));
        System.out.println(s.headSet(3));
        System.out.println(s.subSet(3,10));
        System.out.println(s.comparator());

    }
}
