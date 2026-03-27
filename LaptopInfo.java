class LaptopInfo {

    // 3 static variables
    static String brand = "HP";
    static String processor = "Intel i5";
    static int warrantyYears = 2;

    public static void main(String[] args) {

        // 3 local variables
        String model;
        double price;
        boolean isAvailable;

        model = "Pavilion 15";
        price = 58999.00;
        isAvailable = true;

        System.out.println("Brand        : " + brand);
        System.out.println("Processor    : " + processor);
        System.out.println("Warranty     : " + warrantyYears + " years");
        System.out.println("Model        : " + model);
        System.out.println("Price        : " + price);
        System.out.println("Available    : " + isAvailable);
    }
}