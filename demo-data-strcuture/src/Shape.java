import java.util.List;

public abstract class Shape {
  public abstract double area();

  public static <T extends Shape> double totalArea(List<T> shape) {
    return -1;
  }

  // Cricle, Rectangular
   
}
