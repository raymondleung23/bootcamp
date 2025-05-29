public class Shape {
  private static int counter = 0;
  private static final double PI = 3.14159; // constant
  private final String name = "John";
  private String color;
  // final ->W

// final --> finalized

public Shape() {

}

public Shape(String color2) {
  //TODO Auto-generated constructor stub
}

public static void main(String[] args) {
  System.out.println(Shape.PI);
  // ! because Shape.PI is a "final" variable so cannot be modified
  //Shape.PI == 1;
  Shape.counter++;
  System.out.println(Shape.counter); // 1

  new Shape().counter ++;
  System.out.println(Shape.counter);
  Shape.counter++;

  // print Jonn
  Shape s1 = new Shape();
  System.out.println(s1.getName)); John
}s



  
} 
