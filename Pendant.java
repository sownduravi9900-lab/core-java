class Pendant {

    // Static variables (class variables)
    static String material = "Gold";
    static String design = "Floral";
    static float weight = 12.5f;
    static double price = 45000.00;
    static boolean isStoneStudded = true;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String material = "Silver";
        String design = "Heart";
        float weight = 8.2f;
        double price = 18000.00;
        boolean isStoneStudded = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Material        : " + material);
        System.out.println("Design          : " + design);
        System.out.println("Weight          : " + weight);
        System.out.println("Price           : " + price);
        System.out.println("Stone Studded   : " + isStoneStudded);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Material        : " + Pendant.material);
        System.out.println("Design          : " + Pendant.design);
        System.out.println("Weight          : " + Pendant.weight);
        System.out.println("Price           : " + Pendant.price);
        System.out.println("Stone Studded   : " + Pendant.isStoneStudded);
    }
}