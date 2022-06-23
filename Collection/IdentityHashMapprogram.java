package Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapprogram {
    public static void main(String args[])
    {
        IdentityHashMap h=new IdentityHashMap(); // == method using jvm
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        h.put(i1,"pawan");
        h.put(i2,"kalayan");
        System.out.println(h);
        HashMap h1=new HashMap(); // .equals() method
        h1.put(i1,"pawan");
        h1.put(i2,"kalayan");
        System.out.println(h1);

    }
}
