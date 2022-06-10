package controlStatement;

public class codingchallenge {
    public static void main(String args[])
    {
        int mark=91;
        if(mark<60)
        {
            System.out.println("fail");
        }
        else if(mark<90)
        {
            System.out.println("pass");
        }
        else if (mark>=90)
        {
            System.out.println("passed with Distinction");
        }
        if(mark<60)
        {
            System.out.println("fail");
        }
        else
        {
              if(mark<90)
              {
                   System.out.println("pass");
              }
              else
              {
                      System.out.println("passed with Distinction");
                 }
        }
    }
}
