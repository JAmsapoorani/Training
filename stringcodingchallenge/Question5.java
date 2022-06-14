package stringcodingchallenge;

public class Question5 {
    public static void main(String[] args)
    {
        String s="((W&e**_lco73me %t%o co!@$,,<r>e <j>>>$@av```~a777.||}{";
        System.out.println(filterString(s));
    }
    private static String filterString(String str)
    {
        StringBuilder builder=new StringBuilder();
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122)|| str.charAt(i)==32)
            {

                temp=temp+str.charAt(i);
            }
        }
        return temp;
    }
}
