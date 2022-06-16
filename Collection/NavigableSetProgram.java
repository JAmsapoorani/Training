package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetProgram {
    public static void main(String[] args)
    {
        NavigableSet n=new TreeSet();
        n.add(11);
        n.add(2);
        n.add(33);
        n.add(9);
        n.add(12);
        System.out.println(n);
        System.out.println(n.floor(5));
        System.out.println(n.lower(9));
        System.out.println(n.higher(9));
        System.out.println(n.ceiling(9));
        System.out.println(n.descendingSet());
        System.out.println(n.pollFirst());
        System.out.println(n.pollLast());



    }
}
