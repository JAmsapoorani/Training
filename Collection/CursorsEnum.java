package Collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnum {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        System.out.println("enter the element:");
        for(int i=0;i<=8;i++)
        {
            Scanner s=new Scanner(System.in);
            Integer data=s.nextInt();
            v.addElement(data);
        }
        System.out.println("Vector:"+v);
        Enumeration e=v.elements();
        int val=0;
        while(e.hasMoreElements())
        {
            val=(int)e.nextElement();
            if(val%3==0)
            System.out.println(val);
        }
          }
}
