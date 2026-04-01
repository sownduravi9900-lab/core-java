class Ajio {
    String productName;
    String category;
    int stock;
    double price;
    float discount;
    boolean isNewArrival;
    char sizeCode;

    Ajio(String productName, String category, int stock, double price,
         float discount, boolean isNewArrival, char sizeCode) {
        this.productName = productName;
        this.category = category;
        this.stock = stock;
        this.price = price;
        this.discount = discount;
        this.isNewArrival = isNewArrival;
        this.sizeCode = sizeCode;
    }

    void display() {
        System.out.println(productName);
        System.out.println(category);
        System.out.println(stock);
        System.out.println(price);
        System.out.println(discount);
        System.out.println(isNewArrival);
        System.out.println(sizeCode);
        System.out.println("********************************");
    }
}