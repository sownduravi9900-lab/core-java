class SmartBag {

    // 3 static variables
    static String brand = "Skybags";
    static int capacity = 30;      
    static boolean isWaterproof = true;

    public static void main(String[] args) {

        // 3 local variables
        String color;
        double price;
        int weight;   

        color = "Blue";
        price = 1999.99;
        weight = 850;

        System.out.println("Brand        : " + brand);
        System.out.println("Capacity     : " + capacity + "L");
        System.out.println("Waterproof   : " + isWaterproof);
        System.out.println("Color        : " + color);
        System.out.println("Price        : " + price);
        System.out.println("Weight (g)   : " + weight);
    }
}