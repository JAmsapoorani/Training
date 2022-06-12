package Arrays;
/*
Write a java program to accept more than 1 digit as command-line arguments and display the
highest digit to the user.
For example, if user passes 9, 14, 0, 23, 98, 2, 45
Output should be: Highest digit is: 98
 */
public class Commandlineusingfindhighestvalue {
    public static void main(String[] args)
    {
        int[] arr=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        int max=arr[0];
        for(int i=0;i<args.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Highest digit is:"+max);
    }
}
