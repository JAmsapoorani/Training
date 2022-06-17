package Collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapProgram {
    public static void main(String[] args)
    {
        ConcurrentHashMap<Integer,String> c=new ConcurrentHashMap<>();
        c.put(0,"basics");
        c.put(1,"Strong");
        c.put(0,"tech");
        c.put(2,"java");
        System.out.println(c);
        System.out.println(c.putIfAbsent(0,"values"));
        System.out.println(c.remove(0,"strong"));
        System.out.println(c.replace(1,"Strong","basicStrong"));
        System.out.println(c.replace(2,"javaprogram"));
        Iterator<Entry<Integer,String>> itr=c.entrySet().iterator();
        if(itr.hasNext())
        {
            Entry e=itr.next();
            if(e.getKey().equals(0))
            {
                c.put(1,"hello");
            }

        }
    }


}
