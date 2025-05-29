import java.math.BigDecimal;

public class Circle {
  private double radius;
  private String color;
  // private double area; // violate OOP concept

  // Constructor (all args constructor)
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double diameter() {
    return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(2.0))
      .doubleValue();
  }

  public String getColor() {
    return this.color;
  }

  public double getRadius() {
    return this.radius;
  }


  
  // Type of Method: Presentation
  public double area() {
    return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
  }

  public static double area2(double radius) {
    return BigDecimal.valueOf(radius)
      .multiply(BigDecimal.valueOf(radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
  }

  public static void main(String[] args) {


    Circle c1 = new Circle(3.5, "RED");
    System.out.println(c1.a();
    circles[0] = c2;
    circles[1] = c1;
rea()); // 3.5 * 3.5 * PI

    Circle c2 = new Circle(4.5, "BLUE");
    System.out.println(c2.area());

    Circle[] circles = new Circle[2];
    //Circle c1 = new Circle();
    //Circle c2 = new Circle
    System.out.println(circles[0].getColor());
    System.out.println(c2.getColor());

    System.out.println(circles[1].area());
    System.out.println(c1.area());

    System.out.println(c1.diameter()); // 7.0
    System.out.println(c2.diameter()); // 9.0

    // What if we don't backup the circle address
    Circle[] circles2 = new Circle[3];
    circles2[0] = new Circle(9.0, "BLACK");
    circles2[1] = new Circle(2.3, "YELLOW");
    circles2[2] = new Circle(1.9, "PINK");
    System.out.println(circles[0].getRadius());

    // Non-OOP
    // double radius = c1.getRadius();
    // double area = BigDecimal.valueOf(this.radius)
    // .multiply(BigDecimal.valueOf(this.radius))
    // .multiply(BigDecimal.valueOf(Math.PI))
    // .doubleValue();

    System.out.println(Circle.area2(23));


  }

}
