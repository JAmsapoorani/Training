package oopsconcepts;
/*
You are not allowed to modify TestTransaction.java file.
Modify Transaction.java file such that on executing TestTransaction class, following output is
displayed in the Console:
Transaction [ID = 1001, Description = Testing 1]
Transaction [ID = 1001, Description = Testing 2]
Transaction [ID = 1002, Description = Testing 1]
true
false
 */
public class TestTransaction {
    public static void main(String[] args)
    {
        Transaction t1=new Transaction(1001);
        t1.setDet("Testing 1");
        Transaction t2=new Transaction(1001);
        t2.setDet("Testing 2");
        Transaction t3=new Transaction(1002);
        t3.setDet("Testing 3");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }
}
