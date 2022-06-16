package Collection;

import java.util.Comparator;

public class ComparatorInterface implements Comparator{
    public int compare(Object o1,Object o2)
    {
        Integer c1=(Integer) o1;
        Integer c2=(Integer) o2;
        if(c1>c2)
        {
            return -1;
        }
        if(c1<c2)
        {
            return +1;
        }
        else
        {
            return 0;
        }
    }
}
