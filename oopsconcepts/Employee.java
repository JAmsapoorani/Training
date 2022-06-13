package oopsconcepts;
/*
1. This class should be well encapsulated.
2. Provide a parameterized constructor to initialize all the instance variables.
3. name provided during object creation cannot be changed later.
4. salary and organization can be changed later.
5. Provide toString() method such that we get following output when object is passed in
System.out.println statement:
Employee: [Udayan, 500000.0, XYZ Corp.]
6. Use Eclipse IDE code generation feature to generate constructor, getter and setter codes.

 */
public class Employee {
   private String name="udayan";
    double salary;
    String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee( double salary, String organization) {
        this.salary = salary;
        this.organization = organization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", organization='" + organization + '\'' +
                '}';
    }
    public void print()
    {
        System.out.println("Employee: ["+this.name+","+salary+","+organization+"]");
    }
    public static void main(String[] args)
    {
        Employee e=new Employee(300000.00,"xyz corp.");
        e.print();
        Employee e1=new Employee(250000.00,"abc itsolution");
        e1.print();
    }
}
