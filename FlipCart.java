class FlipCart {
    String itemName;
    int stock;
    double discountPrice;
    float rating;
    boolean isAvailable;
    FlipCart(String itemName, int stock, double discountPrice, float rating, boolean isAvailable) {
        this.itemName = itemName;
        this.stock = stock;
        this.discountPrice = discountPrice;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }
    void display() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Stock: " + stock);
        System.out.println("Discount Price: " + discountPrice);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("----------------------");
    }
}