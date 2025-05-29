
  // ! enum
  // ! When you execute the main method, JVM create enum objects (Color.RED, Color.BLUE) for you automatically
  // RED AND BLUE are 2 different and globally unique objects
  public enum Color {
    //private String value; // RED, BLUE ...
    RED, BLUE,;



    //public Color(String value) {
    //   this.value = value;
    // }



  public static void main(String[] args) {
    // System.out.println(new Color("RED"));
    // System.out.println(new Color("BLUE"));
    System.out.println(Color.BLUE.compareTo(RED));
  }

}

