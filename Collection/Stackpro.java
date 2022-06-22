package Collection;

import java.util.Stack;

public class Stackpro {
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push(10);
        s.push(11);
        s.push(4);
        s.push(9);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search(10));
        System.out.println(s.search(13));

    }
}
