package Collection;

import java.util.TreeSet;

public class TreeSetComparableinterfce {
    public static void main(String args[])
    {
        TreeSet<Integer> t=new TreeSet<Integer>(new ComparatorInterface());
        t.add(10);
        t.add(3);
        t.add(9);
        t.add(4);
        t.add(8);
        System.out.println(t);
        TreeSet<Employee> ts=new TreeSet<Employee>();
        ts.add(new Employee(101,"mani"));
        System.out.println(ts);
    }
}
