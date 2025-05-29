public class Order {

  // checkoutAmount
  // private double[] prices;
  // private int[] quantities;

  // Alternative
  private Item[] items;

  // public Order() {
  //   this.items = new Item[0];
  // }

  public Order(Item item) {
    this.items = new Item[1];
    this.items[0] = item;
  }
  
  public void add(Item newItem) {
    Item [] newItems = new Item[this.items.length + 1];
    for (int i=0; i< this.items.length; i++) {
      newItems[i] = items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }

  // BigDecimal
  // ! Item.java owns price & quantity (attribute), so Item has to present price and quantity.
  public double checkoutAmount() {
    
    double total = 0.0;
    for (int i=0; i< this.items.length; i++) {
      total += this.items[i].subtotal();
    }
    return total;
  }

  public static void main(String[] args) {

    Item itemA = new Item(99, 2);
    Order order = new Order(itemA);
    
    order.add(itemA);

    Item itemB = new Item(14, 3);
    order.add(itemB);

    System.out.println(order.checkoutAmount()); // 240.0
  }
}
