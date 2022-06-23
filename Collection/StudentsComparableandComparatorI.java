package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Student1 implements Comparable
{
    int id;
    String name;

     Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int id1=this.id;
        Student1 sid=(Student1) o;
        int id2=sid.id;
        if(id1<id2)
        {
            return -1;
        } else if (id1>id2) {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
public class StudentsComparableandComparatorI {
    public static void main(String[] args)
    {
    Student1 s=new Student1(1001,"amsa");
    Student1 s1=new Student1(100,"kavi");
    Student1 s2=new Student1(1003,"mani");
    Student1 s3=new Student1(90,"nidhar");
        TreeSet t=new TreeSet<>();
        t.add(s);
        t.add(s1);
        t.add(s2);
        t.add(s3);
        System.out.println(t);
        TreeSet t1=new TreeSet<>( new MyComparator());
        t1.add(s);
        t1.add(s1);
        t1.add(s2);
        t1.add(s3);
        System.out.println(t1);
    }
}
