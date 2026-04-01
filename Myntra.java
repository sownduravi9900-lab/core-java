class Myntra {
    String userName;
    String brand;
    int quantity;
    double price;
    float rating;
    boolean isAvailable;
    char sizeCode;

   
    Myntra(String productName, String brand, int quantity, double price,
           float rating, boolean isAvailable, char sizeCode) {
        this.productName = productName;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.rating = rating;
        this.isAvailable = isAvailable;
        this.sizeCode = sizeCode;
    }

    void display() {
        System.out.println( productName);
        System.out.println(brand);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(rating);
        System.out.println(isAvailable);
        System.out.println(sizeCode);
        System.out.println("----------------------");
    }
}