class Handbag {

    // 3 static variables
    static String brand = "Lavie";
    static String material = "Leather";
    static int maxCapacity = 5;

    public static void main(String[] args) {

        // 3 local variables
        String color;
        double price;
        boolean isAvailable;

        color = "Black";
        price = 2499.50;
        isAvailable = true;

        System.out.println("Brand       : " + brand);
        System.out.println("Material    : " + material);
        System.out.println("Max Capacity: " + maxCapacity);
        System.out.println("Color       : " + color);
        System.out.println("Price       : " + price);
        System.out.println("Available   : " + isAvailable);
    }
}