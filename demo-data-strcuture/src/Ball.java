import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball {

  private Color color;
  
  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public static enum Color {
    RED, BLUE, YELLOW,;
  }

  @Override
  public String toString() {
    return "Ball("
    + "color="

    }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.YELLOW));

    //Array.sort() --> sort array
    Array.sort(balls);

    //sort List
    Collections.sort(balls, new SortedByBall());
    System.out.println(balls);


    //SortByBall.java
    // YELLOW --> RED --> BLUE
    
    // Assignment: SortByBall2.java
    //Sort color first, if color is ame, larger number goes first
    YELLOW, 9 --> YELLOW, 5 --> RED, 1000 --> BLUE, 10 --> 
    // if color is same, 
  }
}
