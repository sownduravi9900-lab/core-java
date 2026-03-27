class Mirror {

    // Static variables (class variables)
    static String shape = "Round";
    static int height = 120;
    static int width = 60;
    static float price = 1500.75f;
    static boolean isFramed = true;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String shape = "Rectangle";
        int height = 100;
        int width = 50;
        float price = 950.50f;
        boolean isFramed = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Shape     : " + shape);
        System.out.println("Height    : " + height);
        System.out.println("Width     : " + width);
        System.out.println("Price     : " + price);
        System.out.println("Framed    : " + isFramed);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Shape     : " + Mirror.shape);
        System.out.println("Height    : " + Mirror.height);
        System.out.println("Width     : " + Mirror.width);
        System.out.println("Price     : " + Mirror.price);
        System.out.println("Framed    : " + Mirror.isFramed);
    }
}