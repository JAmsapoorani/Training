package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetprogram {
    public static void main(String[] args)
    {
        LinkedHashSet s=new  LinkedHashSet();
        s.add(12);
        s.add(10);
        s.add(1);
        s.add(0);
        s.add(9);
        s.add(10);
        System.out.println(s);
        System.out.println(s.add(9));
        s.remove(1);
        System.out.println(s);
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Integer i=(Integer) itr.next();
            if(i.equals(12))
            {
                itr.remove();
            }

        }
        System.out.println(s);
    }
}
