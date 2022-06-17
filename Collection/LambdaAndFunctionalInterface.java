package Collection;

public class LambdaAndFunctionalInterface {
    public static void main(String[] args)
    {
       // callFunction c=new callFunction();
        //c.funMethod();
        MyFunctionalInterface myf=()->
            System.out.println("Functional method");
        myf.funMethod();
    }
}
interface MyFunctionalInterface
{
    public void funMethod();
}
/*
class callFunction implements MyFunctionalInterface
{
    public void funMethod()
    {
        System.out.println("Functional method");
    }
}*/