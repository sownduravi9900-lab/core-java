class Wood {

    // Static variables (class variables)
    static String type = "Teak";
    static int length = 12;
    static int width = 6;
    static float price = 850.75f;
    static boolean isPolished = true;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String type = "Plywood";
        int length = 8;
        int width = 4;
        float price = 450.50f;
        boolean isPolished = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Type       : " + type);
        System.out.println("Length     : " + length);
        System.out.println("Width      : " + width);
        System.out.println("Price      : " + price);
        System.out.println("Polished   : " + isPolished);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Type       : " + Wood.type);
        System.out.println("Length     : " + Wood.length);
        System.out.println("Width      : " + Wood.width);
        System.out.println("Price      : " + Wood.price);
        System.out.println("Polished   : " + Wood.isPolished);
    }
}