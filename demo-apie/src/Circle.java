import java.math.BigDecimal;

public class Circle extends Shape{
  //private String
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }


  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();

  }
  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
    // ! 1. equals()
    o1.equals(o1);
    System.out.println(o1.equals(o2)); // false
    System.out.println(o1.equals(o3)); // true

    // ! 2. hashCode()
    System.out.println(o1.hashCode());
    System.out.println(o2.hashCode());
    System.out.println(o3.hashCode());

    // ! 3. toString()
    System.out.println(o1.toString());
    System.out.println(o2.toString());
    System.out.println(o3.toString());

    Card c1 = new Card('A', 'D');
    Card c2 = new Card('A', 'D');
    System.out.println(c1.equals(c2)); 
    // false, if it is using Object.equals(), we do not ovverride in Card.class
    // ! Object.equals() is checking address
    // true, if you re-define Card.equals()

    // ! The definition of hashCode() always same as equals()
    System.out.println(c1.hashCode()); // 3044
    System.out.println(c2.hashCode()); // 3044

    System.out.println(c1); // Card(rank=A, suit=D)
    System.out.println(c2); // Card(rank=A, suit=D)
    System.out.println(c1 == c2); // false

    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.compareTo(s2)); // 0
    System.out.println(s2.compareTo("abcde")); // 7

    Integer x = 10;
    System.out.println(x.equals(10)); // true
    System.out.println(x.compareTo(8)); // 1

  }
}
