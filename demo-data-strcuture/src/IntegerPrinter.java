public class IntegerPrinter {
  private Integer value;

  public IntegerPrinter(Integer value) {
    this.value = value;Integer
  public void print() {
    System.out.println(this.value);
  }

  public static void main(Integer[] args) {
    IntegerPrinter sp = new IntegerPrinter("hello");
    sp.print(); // hello
  }
}