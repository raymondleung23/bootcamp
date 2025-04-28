public class Employee {
  private String name;
  private int age;
  private String email;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {

    //Problem
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee1Email = "steven@gmail.com";

    // Solution - Class and Object
    Employee e1 = new Employee();
    e1.setName("John");
    System.out.println(e1.getName());
  }
  
}
