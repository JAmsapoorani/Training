package Collection;

import java.util.HashMap;
import java.util.WeakHashMap;
class Temp1
{
    public String toString()
    {
        return "temp";
    }

    @Override
   public void finalize() {
        System.out.println("finalized method called");
    }
}
public class WeakHashMapprogram {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap w=new WeakHashMap();
        Temp1 t=new Temp1();
        w.put(t,"amsa");
        System.out.println(w);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(w);
      HashMap w1=new HashMap();
        Temp1 t1=new Temp1();
        w1.put(t1,"amsa");
        System.out.println(w1);
        t1=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(w1);
    }
}
