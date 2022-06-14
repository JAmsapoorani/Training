package EnumCodingChallenge;
enum Alphabets
{
    A
            {
                public String getType()
                {
                    String str="Vowel";
                    return str;
                }
            },B,C,D,E{
    public String getType()
    {
        String str="Vowel";
        return str;
    }
}
   ,F,G,H,I
        {
            public String getType()
            {
                String str="Vowel";
                return str;
            }
        },J,K,L,M,N,O
        {
            public String getType()
            {
                String str="Vowel";
                return str;
            }
        },P,Q,R,S,T,U
        {
            public String getType()
            {
                String str="Vowel";
                return str;
            }
        },V,W,X,Y,Z;
    public String getType()
    {
        String str="Consonant";
        return str;
    }

}
public class Question3 {
   public static void main(String[] args)
   {
       for(Alphabets alphabets:Alphabets.values())
       {
           System.out.println(alphabets.toString()+":"+alphabets.getType());
       }
   }

}
