public class Candy {

  private static int count = 20;
  private String color;
  private int number;

  // Candy has color, number
  public Candy(String color, int number) {
    this.color = color;
    this.number = number;
  }

  public String getColor() {
    return this.color;
  }

  public int getNumber() {
    return this.number;
  }



  public static void main(String[] args) {

    Candy[] candies = new Candy[20];
    Candy c1 = new Candy("red", 10);
    Candy c2 = new Candy("blue", 5);
    Candy c3 = new Candy("green", 5);
    candies[0] = c1;
    candies[1] = c2;
    candies[2] = c3;

    // Distribute 20 candy to 3 Students
    // Every Student has his own candies
    // print out the candy (color, number) of every students

    // use loop to distribute candy

    // Teacher.java -> distribute
    // Student -> receive(Candy candy)
  }


}
