package stringcodingchallenge;

public class Question2 {
    public static void main(String[] args)
    {
        String str="abcdef";
        System.out.println(reverse(str));
    }
    private static String reverse(String source)
    {
        String temp="";
        for(int i=source.length()-1;i>=0;i--)
        {
            temp+=source.charAt(i);
        }
        return temp;
    }
}
