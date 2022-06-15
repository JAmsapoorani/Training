package Collection;

import java.util.Vector;

public class Vectorprogram{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        Vector v1=new Vector(3);
        Vector v2=new Vector(10,2);
        v.add(10);
        v.addElement("hello");
        System.out.println(v);
        v.removeElement(10);
        System.out.println(v);
        v.addElement("hai");
        System.out.println(v.elementAt(0));
        System.out.println(v.firstElement());
        v.add(111);
        System.out.println(v.get(1));

    }
}
