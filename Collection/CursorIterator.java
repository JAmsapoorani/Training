package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorIterator {
    public static void main(String[] args)
    {
        ArrayList<Integer> data=new ArrayList<>();
        data.add(10);
        data.add(11);
        data.add(12);
        data.add(15);
        data.add(8);
        Iterator itr= data.iterator();
        while (itr.hasNext())
        {
            int i=(int)itr.next();
            if(i%3==0)
            {
                System.out.println(i);
            }
            else
            {
                itr.remove();
            }
        }
        System.out.println(data);
    }
}
