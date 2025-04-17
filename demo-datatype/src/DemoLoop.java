public class DemoLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;

    // 2^10
    // ! For Loop
    // for (initialization; continue condition; modifier)
    //Step 1: i-0
    //Step 2: check if i < 3
    //Step 3: if yes, print hello
    //Step 4: i + 1
    //Step 5: check if i < 3
    //Step 6: yes, print hello
    //Step 7: i + 1
    //Step 8: check if i < 3
    //Step 9: yes, print hello
    //Step 10: i + 1
    //Step 11: check if i < 3
    //Step 12: No -> exit loop

    for (int i=0; i<3; i++) {
      System.out.println("hello");
    } 

    // 2^10
    int y = 2;

    for (int i=0; i<9; i++) {
      y = y * 2;
    }
    System.out.println(y);

    // for + if
    // find even numbers between 0 - 10
    // even number  --> x % 2 == 0

    for (int i=0; i<11; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // for + if
    // Print the char index of 'm', if found, print the index; if not found, print -1
    String s2 = "bootcamp";
    //boolean isFound = false;
    int index = -1;

    for (int i=0; i<s2.length(); i++) {
      if (s2.charAt(i) == 'm') {
        //is Found = true;
        index = i;
      }
    }
    System.out.println(index);

  }
}
