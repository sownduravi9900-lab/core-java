class Amazon {
    String productName;
    int quantity;
    double price;
    char categoryCode;
    boolean isPrime;

    Amazon(String productName, int quantity, double price, char categoryCode, boolean isPrime) {
        productName = productName;
        quantity = quantity;
        price = price;
        categoryCode = categoryCode;
        isPrime = isPrime;
    }

   
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Category Code: " + categoryCode);
        System.out.println("Prime Delivery: " + isPrime);
        System.out.println("----------------------");
    }
}