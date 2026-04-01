class FlipCart {
    String itemName;
    int stock;
    double discountPrice;
    float rating;
    boolean isAvailable;
    FlipCart(String itemName, int stock, double discountPrice, float rating, boolean isAvailable) {
        itemName = itemName;
        stock = stock;
        discountPrice = discountPrice;
        rating = rating;
        isAvailable = isAvailable;
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