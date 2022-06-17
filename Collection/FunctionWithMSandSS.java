package Collection;

public class FunctionWithMSandSS {
    public static void main(String[] args)
    {
        MyFuninterface m=(a)->
        {
            int x=a+10;
            x=x/2;
            return x;
        };
        int result=m.FunctionMstatement(5);
        System.out.println(result);
    }
}
interface MyFuninterface
{
    public int FunctionMstatement(int a);
}
