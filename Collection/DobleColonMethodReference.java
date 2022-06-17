package Collection;

public class DobleColonMethodReference {
    public static void main(String[] args)
    {
        MyFunctionalNew f=()->System.out.println("Lambda");
        f.method1();
    }
    public static void method2()  //static method reference
    {
        System.out.println("i am method2");
    }
    public  void method3()  //Instance method reference
    {
        System.out.println("i am method3");
    }
}
interface MyFunctionalNew
{
    public void method1();
}
class NewCallerClass
{
    public static void main(String[] args)
    {
        MyFunctionalNew i=DobleColonMethodReference::method2;
        i.method1();
        DobleColonMethodReference obj=new DobleColonMethodReference();
        MyFunctionalNew i1=obj::method3;
        i1.method1();
    }
}