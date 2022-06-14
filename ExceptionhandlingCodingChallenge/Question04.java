package ExceptionhandlingCodingChallenge;

public class Question04 {
    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        for(int a:arr)
        {
            try
            {
                m1(a);
            }
            catch (NullPointerException  | ArithmeticException| ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }


        }
    }
    private static void m1(int i)
    {
        switch (i)
        {
            case 1:
                System.out.println(5/0);
            case 2:
                String s=null;
                System.out.println(s.length());
            case 3:
                String[] arr=new String[1];
                System.out.println(arr[1]);
        }
    }
}
