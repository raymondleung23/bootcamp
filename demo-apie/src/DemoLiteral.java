public class DemoLiteral {
  // ! Literal Pool -> String
  // ! Internal Cache -> Integer, Byte, Short, Long, Boolean, Character

  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "olleh";
    System.out.println(s1.equals(s2)); // true, String Author
    System.out.println(s3.equals(s2)); // false

    System.out.println(s1 == s2); // true, Literal

    String s4 = new String("hello");
    System.out.println(s1 == s4); // false

    String s5 = new String("hello");
    System.out.println(s4 == s5); //false

    String s6 = new String("hello").intern();
    System.out.println(s1 == s6); // true
    System.out.println(s4 == s6); // false

    // -128 to 127
    Integer i1 = 127;
    Integer i2 = 127; // check if internal cache contain 127
    Integer i3 = new Integer(127);
    System.out.println(i1 == i2); // true
    System.out.println(i1 == i3); // false

    // ! there will be two 128 objects in memory.
    Integer i4 = 128;
    Integer i5 = 128;
    System.out.println(i4 == i5); // false

    // -128 to 127
    Byte b1 = 127;
    Byte b2 = 127;
    System.out.println(b1 == b2); // true
    Byte b3 = new Byte("127");
    System.out.println(b1 == b3); // false

    // Integer, Byte, Short, Long
    Boolean n1 = true;
    Boolean n2 = true;
    Boolean n3 = new Boolean(true);
    System.out.println(n1 == n2); // true
    System.out.println(n1 == n3); // false

    // Character (0 - 6xxxx), cache range 0 - 127
    Character c1 = 'A';
    Character c2 = 'A';
    Character c3 = new Character('A');
    System.out.println(c1 == c2); // true
    System.out.println(c1 == c3); // false

    Character c4 = '我';
    Character c5 = '我';
    System.out.println(c4 == c5); // false because > 128

    // valueOf()
    Integer i10 = Integer.valueOf(100);
    Integer i11 = Integer.valueOf(100);
    System.out.println(i10 == i11); // true

    //Conclusion
    /// ! for String & Integer, in real lift, we should use "hello" or String.valueOf("hello")
    // ! for integer, in real lift, we should use 10 or Integer.valueOf(10)
    // You should not use "new" in normal case
  }
  
}
