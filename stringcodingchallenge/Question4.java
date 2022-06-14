package stringcodingchallenge;

public class Question4 {
    private static String[] arr={
            "  ","A","abcdefmQtpz","a$bcddd","wxfdskjf55","zt+ts",null};
    public static void main(String[] args)
    {
        for(String s:arr)
        {
            boolean result=hasAllAlphabete(s);
            if(result)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
   private static boolean hasAllAlphabete(String str)
   {
       if(str==null) {
           return false;
       }else {
           int count=0;
         for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)>=0 && str.charAt(i)<=64)   {
                     count++;
             }
             else {
                 count=0;
             }
         }
         if(count==0)
         {
             return true;
         }
       }
       return false;
   }
}

