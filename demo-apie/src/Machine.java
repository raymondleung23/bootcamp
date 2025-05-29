public abstract class Machine {

  //attribute
  private String status;

  public String getStatus() {
    return this.status;
  }


  // constructor
  public Machine(String status) {
    this.status = status;
  }


  //get

  // child extend Machine
  public abstract void start();
  public abstract void stop();

  // main (Polymorphism)
  public static void main(String[] args) {
    Machine phone = new Phone(17.5, "off");
    System.out.println(phone.getStatus());
    Machine laptop = new Laptop(32, "off");
    System.out.println(laptop.getStatus());

    Laptop l2 = new Laptop(24, "off");
    System.out.println(l2.getRam());

    System.out.println(l2.getStatus());
  }
}
