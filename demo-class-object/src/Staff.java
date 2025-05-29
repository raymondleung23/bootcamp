public class Staff {
  private long id;

  public Staff(long id) {
    this.id = id;
  }

  public long getId() {
    return this.id;
  }


  public boolean eqauls(Staff staff) {
    if (this.id == staff.getId()) {
      return true;
    }
    return false;
  }

  // equals() -> String, Ingeger, Double

  public static void main(String[] args) {
    Staff s1 = new Staff(1L);

    if (s1.getId() == 1L) {

    }

   System.out.println(s1.equals(new Staff(1L))); // suppose true, but false now
   // ! by default, Jave implicitly say that equals() checking object's address

   // after rewriting the equals method, new Staff(1) equals new Staff(1)
    

  }
}
