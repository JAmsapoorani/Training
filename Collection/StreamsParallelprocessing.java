package Collection;

import Collection.Employee;

import java.util.ArrayList;
import java.util.List;

public class StreamsParallelprocessing {
    public static void main(String[] args)
    {
        long time1,time2;
        List<Employee> list=new ArrayList<Employee>();
        for(int i=0;i<100;i++)
        {
            list.add(new Employee(1000,"A"));
            list.add(new Employee(1034,"B"));
            list.add(new Employee(2304,"C"));
            list.add(new Employee(3456,"D"));
            list.add(new Employee(4580,"E"));
            list.add(new Employee(800,"F"));
        }
    time1=System.currentTimeMillis();
        System.out.println("Sequential order:"+list.stream().filter(e->e.getEmpid()>=2000).toList());
        time2=System.currentTimeMillis();
        long count=list.stream().filter(e->e.getEmpid()>=2000).count();
        System.out.println(count);

        System.out.println("Sequential order time taken :"+(time2-time1)+" \n");

        //parallel stream processing

        time1=System.currentTimeMillis();
        System.out.println("parallel order:"+list.parallelStream().filter(e->e.getEmpid()>=2000).toList());
        long count1=list.parallelStream().filter(e->e.getEmpid()>=2000).count();
        System.out.println(count1);
        time2=System.currentTimeMillis();
        System.out.println("parallel order time taken :"+(time2-time1)+" \n");
    }
}
