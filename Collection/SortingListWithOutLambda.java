package Collection;

import java.util.*;

public class SortingListWithOutLambda {
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(11);
        System.out.println(list);
        //Collections.sort(list,new Mycomparator());
        Collections.sort(list,(o1,o2)->
        {
            if(o1>o2){
                return -1;
            } else if (o1<o2) {
                return 1;
            }
            else {
                return 0;
            }
        });
        System.out.println(list);

    }
}
/*
class Mycomparator implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1>o2)
        {
            return -1;
        }
        else if(o1<o2)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
}*/