class Bangle {

    // Static variables (class variables)
    static String material = "Gold";
    static int size = 6;
    static float weight = 25.5f;
    static double price = 75000.00;
    static boolean isHallmarked = true;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String material = "Silver";
        int size = 5;
        float weight = 18.2f;
        double price = 32000.00;
        boolean isHallmarked = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Material     : " + material);
        System.out.println("Size         : " + size);
        System.out.println("Weight       : " + weight);
        System.out.println("Price        : " + price);
        System.out.println("Hallmarked   : " + isHallmarked);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Material     : " + Bangle.material);
        System.out.println("Size         : " + Bangle.size);
        System.out.println("Weight       : " + Bangle.weight);
        System.out.println("Price        : " + Bangle.price);
        System.out.println("Hallmarked   : " + Bangle.isHallmarked);
    }
}