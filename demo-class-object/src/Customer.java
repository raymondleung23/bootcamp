public class Customer {

  private long id;
  private String name;
  private Order[] orders;

  public Customer() {
    this.orders = new Order[0]; // array object
  }

  public String getName() {
    return this.name;
  }

  public long getId() {
    return this.id;
  }

  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i=0; i<orders.length; i++) {
      newOrders[i] = orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  }

  public boolean isVIP() {
    //return add(this.orders) > 100_000;
    double total = 0.0;
    for (int i=0; i<this.orders.length; i++) {
      total += this.orders[i].checkoutAmount();
    }
    // if (total > 100_000) {
    //   return true;
    // }
    // return false;
    return total > 100_000;
  }

  // main()
  // John -> many Orders -> Items

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    
    Customer c1 = new Customer();
    c1.setName("Jonh");

    Item itemA = new Item(10.9, 2);
    Item itemB = new Item(99.9, 3);

    Order orderA = new Order(itemA);
    orderA.add(itemB);
    
    c1.add(orderA);

    // is VIP();
    // total amount of oders > 100_000
    System.out.println("Customer " + c1.getName() + ", VIP status: " + c1.isVIP());


  }



}
