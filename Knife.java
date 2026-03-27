class Knife {

    // 5 Static Variables (Class Variables)
    static String brand = "Prestige";
    static String type = "Kitchen";
    static int price = 350;
    static float length = 8.5f;
    static boolean isSharp = true;

    public static void main(String[] args) {

        // 5 Local Variables
        String material = "Steel";
        String color = "Silver";
        int weight = 120;
        char grade = 'A';
        boolean isFoldable = false;

        // Printing Static Variables
        System.out.println("brand: " + brand);
        System.out.println("type: " + type);
        System.out.println("price: " + price);
        System.out.println("length: " + length);
        System.out.println("isSharp: " + isSharp);

        // Printing Local Variables
        System.out.println("material: " + material);
        System.out.println("color: " + color);
        System.out.println("weight: " + weight);
        System.out.println("grade: " + grade);
        System.out.println("isFoldable: " + isFoldable);
    }
}