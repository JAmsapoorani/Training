package Collection;

import java.util.SortedSet;
import java.util.TreeSet;
interface comparator
{
    public int compare(Object o,Object o1);
}
public class SortedSetprogram {
    public static void main(String[] args)
    {
        SortedSet s=new TreeSet();
        s.add(10);
        s.add(12);
        s.add(2);
        s.add(9);
        s.add(7);
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet(9));
        System.out.println(s.tailSet(7));
        System.out.println(s.subSet(2,10));
        comparator c=new comparator() {
            @Override
            public int compare(Object o, Object o1) {
                Integer i=(Integer) o;
                Integer i1=(Integer) o1;
                if(i>=i1)
                {
                    return 1;
                }
                else if(i<=i1)
                {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        };
        System.out.println(s.comparator());
        System.out.println(c.compare(10,12));

    }
}
