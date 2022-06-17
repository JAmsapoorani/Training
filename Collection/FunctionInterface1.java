package Collection;

import java.util.function.Function;

public class FunctionInterface1 {
    public static void main(String[] args)
    {
        String s="basicStrong";
        Function<String,Integer> f= str->str.length();
        int len=f.apply(s);
        System.out.println(len);
    }

}
