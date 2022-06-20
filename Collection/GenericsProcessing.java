package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsProcessing<T>{
    public static void main(String[] args)
    {
        Data<String> d=new Data<>("Generics type");
        System.out.println(d.toString());
        Data<Integer> d1=new Data<>("10");
        System.out.println(d1.toString());
        IData<String> d2=new Data<>("I am Generics interface");
        System.out.println(d2.toString());
    }
}
