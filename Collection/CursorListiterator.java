package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListiterator  {
    public static void main(String[] args)
    {
        ArrayList<String> li=new ArrayList<>();
        li.add("Hai");
        li.add("Hello");
        li.add("Welcome");
        li.add("Good");
        System.out.println(li);
        ListIterator<String> val=li.listIterator();
        while(val.hasNext())
        {
        String s=val.next();
         if(s.equals("Hai"))
         {
             val.add("HaiAll");
         }
       if(s.equals("Hello"))
        {
            val.remove();
         }
      if(s.equals("Good"))
        {
            val.set("Good Morning");
        }

        }
        System.out.println(li);

    }
}
