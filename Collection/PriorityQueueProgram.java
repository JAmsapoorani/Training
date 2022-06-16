package Collection;

import java.util.*;

public class PriorityQueueProgram {
    public static void main(String[] args)
    {
        PriorityQueue p=new PriorityQueue();
        p.add(10);
        p.add(5);
        p.add(9);
        p.add(11);
        p.add(5);
        System.out.println(p);
        PriorityQueue p1=new PriorityQueue(20);
        SortedSet s=new TreeSet();
        PriorityQueue p2=new PriorityQueue(s);
        List l=new ArrayList();
        PriorityQueue p3=new PriorityQueue(l);
        System.out.println(p.offer(21));
        System.out.println(p.remove(5));
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.element());
        System.out.println(p);
    }
}
