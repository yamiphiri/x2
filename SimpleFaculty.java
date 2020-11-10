public class SimpleFaculty extends Employee {
  public static void main(String[] args) {
    new SimpleFaculty();
  }  
  public SimpleFaculty() {
    super(); //will call the parent class
    System.out.println("(3) Faculty's no-arg constructor is invoked");
  }
}
class Employee extends Person {
  public Employee() {
    super(); //will call the parent class
    System.out.println("(2) Employee's no-arg constructor is invoked");
  }  
}
class Person {
  public Person() {
    //Super(); //will call the parent class due to no explicit parent it will return an error    
    System.out.println("(1) Person's no-arg constructor is invoked");
  }
}