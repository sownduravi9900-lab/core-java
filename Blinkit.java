class Blinkit {
    String customerName;
    String productName;
    String itemName;
    double totalAmount;

    public Blinkit(String customerName, String productName, String itemName, double totalAmount) {
        this.customerName = customerName;
        this.productName = productName;
        this.itemName = itemName;
        this.totalAmount = totalAmount;
        System.out.println("Order has been placed successfully on Blinkit");
    }

    public Blinkit(String customerName, String itemName) {
        this.customerName = customerName;
        this.itemName = itemName;
        System.out.println(itemName);
    }

    public Blinkit(String customerName) {
        System.out.println(customerName);
        System.out.println("Welcome to Blinkit!");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}

