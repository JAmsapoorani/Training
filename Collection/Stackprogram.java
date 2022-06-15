package Collection;

import java.util.Stack;

public class Stackprogram {
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(true);
        System.out.println(s);
        Object o=s.pop();
        System.out.println(s);
        System.out.println(o);
        Object o1=s.peek();
        System.out.println(s);
        System.out.println(o1);
        System.out.println(s.empty());
        System.out.println(s.search(11));
    }
}
