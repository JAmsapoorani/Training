package Collection;

import java.util.HashMap;
import java.util.WeakHashMap;

import static java.lang.Thread.sleep;

public class WeakHashMapPRo {
    public static void main(String[] args)
    {
        WeakHashMap hm=new WeakHashMap();
        Temp t=new Temp();
        hm.put(t,"element");
        System.out.println(hm);
        t=null;
        System.gc();
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(hm);
    }

}
