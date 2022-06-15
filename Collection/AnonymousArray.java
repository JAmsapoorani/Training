package Collection;

public class AnonymousArray {
    public static void main(String[] args)
    {
        sum(new int[] {1,2,3});
    }
    private static void sum(int[] s)
    {
        int total=0;
        for(int val:s)
        {
            total=total+val;
        }
        System.out.println(total);
    }
}
