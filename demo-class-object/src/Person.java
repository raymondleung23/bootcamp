import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

  // height, weight
  // ! methods:
  // BMI -> double
  // isOverweight -> boolean (bmi > 25)

  // main
  //Person[] -> p1, p2, p3
  // for loop() -> array -> print out their bmi and weight status

  private double height;
  private double weight;

  public Person (double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }

  public double bmi() {
    BigDecimal result = BigDecimal.valueOf(height).multiply(BigDecimal.valueOf(height));
   return BigDecimal.valueOf(this.weight)
    .divide(result, 2, RoundingMode.HALF_DOWN).doubleValue();
  }

  public boolean isOverweight() {
    return this.bmi() > 25;
  }

  public static void main(String[] args) {
 
    Person p1 = new Person(1.76, 80);
    Person p2 = new Person(1.5, 50.5);
    Person p3 = new Person(1.95, 90);
    System.out.println(p1.bmi());
    System.out.println(p1.isOverweight());

    Person[] persons = new Person[3];
    persons[0] = p1;
    persons[1] = p2;
    persons[2] = p3;

    for (int i=0; i<persons.length; i++) {
      System.out.println(persons[i].bmi() + ", " + persons[i].isOverweight());
    }
  }
}
