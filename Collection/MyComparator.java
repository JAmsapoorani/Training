package Collection;

import java.util.Comparator;

public class MyComparator implements Comparator {
    public int compare(Object o,Object o1)
    {
       Student1 s=(Student1)o;
       Student1 s1=(Student1) o1;
       Integer i=s.id;
       Integer i1=s1.id;
       return i1.compareTo(i);
    }
}
