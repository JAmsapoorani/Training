package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetpro {
    public static void main(String[] args)
    {
        HashSet hs=new HashSet();
        HashSet hs1=new HashSet(30);
        HashSet hs2=new HashSet(5,.80f);
        ArrayList list=new ArrayList();
        HashSet hs3=new HashSet(list);
        hs2.add(10);
        hs2.add(11);
        hs2.add(12);
        hs2.add(13);
        hs2.add(14);
        System.out.println(hs2);
        System.out.println(hs2.size());
        hs3= (HashSet) hs2.clone();
        hs2.add(24);
        System.out.println(hs2);
        System.out.println(hs3);
        Iterator itr=hs3.iterator();
        while(itr.hasNext()) {
            int i= (int) itr.next();
            if (!hs2.contains(hs3)) {
                System.out.println(i+"+");
            }
            else if(hs2.contains(hs3)) {
               itr.remove();
            }
        }


    }
}
