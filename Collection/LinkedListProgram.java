package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgram
{
    public static void main(String[] args)
    {
        LinkedList<String> ll=new LinkedList<>();
        ll.add(0,"mani");
        ll.add(1,"kavitha");
        ll.add(2,"Nidharsana");
        ll.add("vinoth");
        ll.addFirst("dharsana");
        System.out.println(ll);
        ListIterator l=ll.listIterator();
        while(l.hasNext())
        {
            //System.out.println(l.next());
            String s=(String) l.next();
            if(s.equals("kavitha"))
            {
                l.add("ram");
            }
            else if(s.equals("dharsana"))
            {
                l.set("Nidhar");
            }
            else if(s.equals("mani"))
            {
                l.remove();
            }
        }
        System.out.println(ll);
    }
}
