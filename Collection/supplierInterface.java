package Collection;

import java.util.function.Supplier;

public class supplierInterface {
    public static void main(String[] args)
    {
        Supplier<String> s=()->"Supplier function supplying string and consume nothing";
        System.out.println(s.get());
    }

}
