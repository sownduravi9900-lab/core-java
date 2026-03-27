class Light {

    // 5 Static Variables 
    static String brand = "Philips";
    static int watt = 12;
    static String color = "White";
    static float price = 299.50f;
    static boolean isOn = false;

    public static void main(String[] args) {

        // 5 Local Variables
        String type = "LED";
        int voltage = 220;
        float brightness = 800.5f;
        char grade = 'A';
        boolean isDimmable = true;

        // Printing Static Variables
        System.out.println("brand: " + brand);
        System.out.println("watt: " + watt);
        System.out.println("color: " + color);
        System.out.println("price: " + price);
        System.out.println("isOn: " + isOn);

        // Printing Local Variables
        System.out.println("type: " + type);
        System.out.println("voltage: " + voltage);
        System.out.println("brightness: " + brightness);
        System.out.println("grade: " + grade);
        System.out.println("isDimmable: " + isDimmable);
    }
}