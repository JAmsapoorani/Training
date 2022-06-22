package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorpro {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.addElement('A');
        v.addElement('c');
        v.add('D');
        v.add('F');
        System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
