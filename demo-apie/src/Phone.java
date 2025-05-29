public class Phone extends Machine{
  private double screenSize;

  public double getScreenSize() {
    return this.screenSize;
  }

  public Phone(double screenSize, String status) {
    super(status);
    this.screenSize = screenSize;
  }

  @Override
  public void start() {
    System.out.println("Laptop is starting...");
    
  }

  public void stop() {
    System.out.println("Laptop is stopping...");
  }

}
