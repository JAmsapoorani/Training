package Collection;

public class FunctionWithoutAandReturnT {
    public static void main(String[] args)
    {
        FunctionInterface i=()->System.out.println("Function without any argument and return Type");
        i.funMethod();
    }
}
interface FunctionInterface
{
    public void funMethod();
}
