package Collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapprogram {
    public static void main(String[] args)
    {
        NavigableMap<String,Integer> n=new TreeMap<>();
        n.put("A",12);
        n.put("D",13);
        n.put("E",45);
        n.put("H",34);
        n.put("C",14);
        System.out.println(n);
        System.out.println(n.ceilingEntry("F"));
        System.out.println(n.floorEntry("j"));
        System.out.println(n.higherEntry("S"));
        System.out.println(n.lowerEntry("d"));
        System.out.println(n.ceilingKey("Z"));
        System.out.println(n.descendingKeySet());
        System.out.println(n.descendingMap());
        System.out.println(n.headMap("h"));
        System.out.println(n.headMap("h",true));
        System.out.println(n.subMap("D","H"));
        System.out.println(n.tailMap("H"));
        System.out.println(n.higherEntry("F"));
        System.out.println(n.navigableKeySet());
    }
}
