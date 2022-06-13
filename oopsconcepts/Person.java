package oopsconcepts;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
      if(obj instanceof Person)
      {
          Person p=(Person) obj;
          String Fname=p.firstName;
          String Lname=p.lastName;
          if(Fname.equalsIgnoreCase(this.firstName) && Lname.equalsIgnoreCase(this.lastName))
          {
              return true;
          }
      }
    return false;
    }
}
