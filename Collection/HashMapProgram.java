package Collection;

import java.util.*;
import java.util.Iterator;

public class HashMapProgram {
    public static void main(String[] args)
    {
        HashMap h=new HashMap();
        h.put(6,"A");
        h.put(4,"C");
        h.put(9,"D");
        h.put(3,"L");
        System.out.println(h);
        Set s=h.entrySet();
        System.out.println("Entry set:"+s);
        Collection c=h.values();
        System.out.println("values"+c);
        Set s1=h.keySet();
        System.out.println("keyset:"+s1);
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getKey().equals(4))
            {
                m.setValue(1);
            }
            else {
                System.out.println(m.getKey()+" ->"+m.getValue());
            }
        }
        System.out.println(h);

    }
}
