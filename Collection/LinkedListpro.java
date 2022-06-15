package Collection;

import java.util.LinkedList;

public class LinkedListpro {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("john");
        l1.add(10);
        l1.add(null);
        l1.add(0);
        System.out.println(l1);
        l1.set(1,13);
        System.out.println(l1);
        l1.add(2,11);
        System.out.println(l1);
        l1.addLast(99);
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        System.out.println(l1.get(3));

    }



}
