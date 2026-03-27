class Umbrella {

    // Static variables (class variables)
    static String color = "Black";
    static int length = 95;
    static int ribs = 8;
    static float price = 799.50f;
    static boolean isFoldable = true;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String color = "Blue";
        int length = 85;
        int ribs = 6;
        float price = 499.00f;
        boolean isFoldable = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Color      : " + color);
        System.out.println("Length     : " + length);
        System.out.println("Ribs       : " + ribs);
        System.out.println("Price      : " + price);
        System.out.println("Foldable   : " + isFoldable);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Color      : " + Umbrella.color);
        System.out.println("Length     : " + Umbrella.length);
        System.out.println("Ribs       : " + Umbrella.ribs);
        System.out.println("Price      : " + Umbrella.price);
        System.out.println("Foldable   : " + Umbrella.isFoldable);
    }
}