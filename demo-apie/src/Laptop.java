public class Laptop extends Machine{
  private int ram;

  public int getRam() {
    return this.ram;
  }

  public Laptop(int ram, String status) {
    super(status);
    this.ram = ram;
  }

  @Override
  public void start() {
    System.out.println("Laptop is starting...");
  }

  public void stop() {
    System.out.println("Laptop is stopping...");
  }

  @Override
  public String getStatus() {
    return "Laptop status: " + super.getStatus();
  }

}
