package Collection;

public class FunctionWithAandWithRtype {
    public static void main(String[] args)
    {
        FunctionWithAR f=(a,b)->{
            int sum=a+b;
            return sum;
        };
       int result= f.FunARmethod(5,6);
       System.out.println("result:"+result);
    }
}
interface FunctionWithAR
{
    int FunARmethod(int a,int b);
}