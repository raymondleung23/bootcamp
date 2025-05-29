public class Child {

  // ! static -> common attribute, NOT belongs to any object
  // ! but all object can access the static variable
  private static int counter = 0;

  // private String hkid;

  // Every Child object has id, firtName and LastName. But no counter.
  // Attribute (Instance variable)
  // Instance = object
  private long id;
  private String firstName;
  private String lastName;

  public Child(String firstName, String lastName) {
    counter++;
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;

  }

  public Child(long id) {

  }

  public long getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  //  public String getHKID() {
  //   return this.hkid;
  // }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // ! Rewrite the definition of Child in your world.
  public boolean equals(Child child) {
    // return this.firstName.equals(child.getFirstName())
    //  && this.lastName.equals(child.getLastName());
    //return this.hkid.equals(child.getHKID());
    //return this.firstName.equals(child.getFirstName());
    return this.id == child.getId();
  }
  
  public static void main(String[] args) {
    Child c1 = new Child("Leo", "Chan");
    if (c1.getFirstName().equals("Leo") && c1.getLastName().equals("Chan")) {
      System.out.println("He is Leo Chan.");
    }
    System.out.println(c1.equals(new Child("Leo", "Chan"))); // true
    System.out.println(c1.equals(new Child("Leo", "Lau"))); // false
    System.out.println(c1.equals(new Child("Peter", "Lau"))); // false
    System.out.println(c1.equals(new Child("Peter", "Chan"))); // false

    Child c2 = new Child("Leo", "Wong");
    System.out.println(c2.getId()); // 6
    System.out.println(c2.equals(new Child("Leo", "Wong"))); //true

    Child c3 = new Child("Leos", "Wong");
    System.out.println(c2.equals(new Child(6)));
    System.out.println(c2.getFirstName().equals("Leo"));
    System.out.println(c2.getLastName().equals("Wong"));
    
  }

}
