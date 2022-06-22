package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorFuction {

    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(7);
        list.add(6);
        list.add(6);
        System.out.println(list);
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        for(Integer i:list)
        {
            System.out.println(i);
        }
        list.forEach((p)-> {System.out.println(p);} );
    }
}
