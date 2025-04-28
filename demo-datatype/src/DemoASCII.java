public class DemoASCII {
  public static void main(String[] args) {
    // convert char to int
    char c = 'a'; // 97 in ascii
    int x = c; // safe
    System.out.println(x); // 97

    int y = 65;
    char c2 = (char)y; // duriing compile time, varialbe y is is not range.
    // convert fro int to char is un-safe

    System.out.println(c2); // 'A'

    System.out.println((char)40); // '0'
    System.out.println((char) 65610); // 3 ASCII: 74

    int x1 = 128;
    byte b1 = (byte) x1;
    System.out.println(b1);  // -128

    // byte -> short -> int -> long ->float -> double

    // char -> int
    float f1 = 10L;
    System.out.println(f1); // 10.0
    double d1 = 100.25f;
    System.out.println(d1);  // 100.25

    long l2 = (long) 10.9f;
    System.out.println(l2); //10

    int x8 = 33000;
    short s3 = (short) x8;
    System.out.println(s3); // -



  }
}