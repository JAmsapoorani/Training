package Collection;

import java.util.function.Predicate;

public class PredicateMethodusing {
    public static void main(String[] args)
    {
        int salary=50000;
        Predicate<Integer> p=result->result>=400000;
        boolean res=p.test(salary);
        System.out.println(res);
    }
}
