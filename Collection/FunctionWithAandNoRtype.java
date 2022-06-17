package Collection;

public class FunctionWithAandNoRtype {
    public static void main(String[] args)
    {
        FunctionLambda d=(a,b)->
        {
            int sum=a+b;
            System.out.println(sum);
        };
        d.interfaceMethod(5,6);
    }
}
 interface FunctionLambda
{
    void interfaceMethod(int a,int b);
}
