package First;

public class A {
     private void display()
    {
        System.out.println("Parent class method");
    }
}
class C extends A{
    private void display()
    {
        System.out.println("child class method");
    }
}
