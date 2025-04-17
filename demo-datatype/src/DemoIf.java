public class DemoIf {
  public static void main (String args[]) {
    int x = 15;
    if (x < 4) {
      System.out.println("hello");
    }

    // if + else
    if (x < 10) {
      System.out.println("goodbye");
    } else {
      System.out.println("welcome");
    }

    // if + else if +else
    int y = 100;
    if (y < 90) {
      System.out.println("y is smaller than 90.");
    } else if (y >= 90 && y < 100) {
        System.out.println("y is 90 < y 90");
    } else { // y >= 100
        System.out.println("y >= 100");
    }

    // double w
    // if w < 100, print "ABC"
    // if w between 103 and 110, print "DEF"
    // for other values,print "XYZ"

    double w = 100;
    if (w < 100) {
      System.out.println("ABC");
    } else if (w >= 110 && w < 103) {
      System.out.println("DEF");
    } else {
      System.out.println("XYZ");
    } 



    // AND &&
    // OR
    int a = 10;
    int b= 20;

    if (a <3 || b < 15) { // OR
      System.out.println("a > 3 OR b < 25.");
    } else {
      System.out.println("error.");
    }

    int q = 4;
    int u = 80;
    if (q < 2) {
      u = u + 2;
    } else if (q < 5){ 
      u = u + 10;
    }
    System.out.println(u);  //82

    q = 10;
    u = 100;

    if (q > 5 && u < 99) {
      System.out.println("hello");
    } else if (q <= 5) {
      System.out.println("bye");
    } else { // q < 5 && u >= 99
      System.out.println("bootcamp");
    }

    // String
    String s1 = "hel";
    System.out.println(s1.length()); // 5

    if (s1.length() > 3) {
      System.out.println("Java");
    } else {
      System.out.println("Python");
    }

    // equals() + if
    String s2 = "abc";
    if (s2.equals("abc")) {
      System.out.println("abc");
    } else {
      System.out.println("not abc");
    }
  

  String s3 = "javascript";
  int score = 0;
  if (s3.equals("java")) {
    score += 1;
  } else {
    score += 2;
  }
  System.out.println(score); // 2


  // charAt
  // Check if the first character of string is 'c', if yes, print "yes', if no, print "no"

  String s4 = "chain";
  if (s4.charAt(0) == 'c') {
    System.out.println("yes");
  } else {
    System.out.println("no");
  }

  // check if the first character of string is 'c' or the last character is 'd',
  // if yes, print "yes, if no, print "no"

  String s5 = "hello world";
  if (s5.charAt(0) == 'c' || s5.charAt(s5.length() -1) == 'd') {
    System.out.println("yes");
  } else {
    System.out.println("no");
  }
}

}