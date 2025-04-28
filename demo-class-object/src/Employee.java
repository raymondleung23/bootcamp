public class Employee {
  //Attributes
  private String name;
  private int age;
  private String email;

  //Object Method (Instance Method)
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail() {
    return this.email;
  }

  public static void main(String[] args) {

    //Problem
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee2Email = "steven@gmail.com";

    // Solution - Class and Object
    Employee e1 = new Employee();
    e1.setName("John");
    e1.setAge(26);
    e1.setEmail("john@gmail.com");

    Employee e2 = new Employee();
    e2.setName("Sally");
    e2.setAge(30);
    e2.setEmail("sally@gmail.com");

    System.out.println(e1.getName());
    System.out.println(e1.getAge());
    System.out.println(e1.getEmail());

    System.out.println(e2.getName());
    System.out.println(e2.getAge());
    System.out.println(e2.getEmail());

    e1 = e2;
    System.out.println(e1.getName());
    System.out.println(e2.getName());


  }
  
}
