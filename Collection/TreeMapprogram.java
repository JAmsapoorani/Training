package Collection;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapprogram {
    public static void main(String[] args) {
        SortedMap s = new TreeMap();
        TreeMap m = new TreeMap(s);
        Map m1 = new HashMap();
        TreeMap m2 = new TreeMap(m1);
        TreeMap t = new TreeMap();
        TreeMap t1=new TreeMap(new Comparatorpro() );
        t.put(23,"");
        t.put(10,"");
        t.put(10,"basic");
        t.put(11,"Strong");
        t1.put(20,"A");
        t1.put(11,"G");
        System.out.println(t);
        System.out.println(t1);
    }

}
