package Collection;

import java.util.ArrayList;
import java.util.List;

public class StreamsProgram {
    public static void main(String[] args)
    {
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(10);
        A.add(20);
        A.add(30);
        A.add(40);
        A.add(50);
        System.out.println(A);
        List list=new ArrayList(A.stream().filter(i->i>=30).toList());
        System.out.println(list);
        List list1=new ArrayList(A.stream().map(i->i*2).toList());
        System.out.println(list1);
        int count= (int) A.stream().filter(i-> (i>=30)).count();
        System.out.println(count);
        List<Integer>l3=A.stream().sorted().toList();
        System.out.println(l3);
        List<Integer>l4=A.stream().sorted((i1,i2)->i2.compareTo(i1)).toList();
        System.out.println(l4);
    }
}
