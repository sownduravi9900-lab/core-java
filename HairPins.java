class HairPins {
    String brand;
    String color;
    int quantity;
    double price;

    HairPins(String brand, String color, int quantity, double price) {
        this.brand = brand;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}