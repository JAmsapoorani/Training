package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class ArrayListProgram {
    public static void main(String[] args)
    {
        Student s=new Student(1001,"amsa");
        Student s1=new Student(1002,"nidhar");
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s);
        list.add(s1);
        System.out.println(list);
        Iterator<Student> itr=list.iterator();
        while(itr.hasNext())
        {
            Student stu=itr.next();
            System.out.println("id:"+stu.id+"\n name:"+stu.name);
        }


    }
}
