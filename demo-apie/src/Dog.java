
public class Dog extends Animal{
  private double weight;

  public Dog(double weight, int age) {
    super(age);
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  @Override
  public int getAge() {
    return -99;
  }


  public static void main(String[] args) {
    Dog dog = new Dog(3.5, 10);
    System.out.println(dog.getWeight());
    System.out.println(dog.getAge());  // 10
  }

}
