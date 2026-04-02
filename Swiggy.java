class Swiggy {
    String customerName;
    String restaurantName;
    String orderItem;
    double orderAmount;

    public Swiggy(String customerName, String restaurantName, String orderItem, double orderAmount) {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.orderItem = orderItem;
        this.orderAmount = orderAmount;
        System.out.println("Order has been placed successfully on Swiggy");
    }
    public Swiggy(String customerName, String orderItem) {
        this.customerName = customerName;
        this.orderItem = orderItem;
        System.out.println(orderItem);
    }

    public Swiggy(String customerName) {
        System.out.println(customerName);
        System.out.println("Welcome to Swiggy!");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}

