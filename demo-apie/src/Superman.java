public class Superman extends Human implements Flyable, Living{

  public Superman(String name) {
    super(name);
  }

  @Override
  public void fly() {
    System.out.println("I am flying ...");
  }

  @Override
  public void eat() {
    System.out.println("I am eating ...");
  }

  @Override
  public void drink() {
    System.out.println("I am drinking ...");
  }

  @Override
  public void walk() {
    System.out.println("I am walking ...");
  }

  // ! You can override or NOT override speak()
  @Override
  public void speak() {
    System.out.println("I am speaking ...");
  }

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    s1.fly();
    s1.eat();;
    s1.speak();
    s1.drink();
    

    Flyable something = new Superman("Peter");
    something.fly(); // Polymorphism
    // hide the method of eat()
    // something.eat();

    Superman s2 = (Superman) something;
    s2.eat();

    Living s3 = new Superman("Steven");
    s3.eat();
    s3.drink();
    // s3.fly();
    // s3.walk();
  }
  
}
