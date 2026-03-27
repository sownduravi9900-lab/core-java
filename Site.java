class Site {

    // Static variables (class variables)
    static String siteName = "BuildZone";
    static String location = "Bangalore";
    static int area = 1200;
    static float cost = 8500000.50f;
    static boolean isApproved = true;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String siteName = "DreamHome";
        String location = "Mysore";
        int area = 900;
        float cost = 6200000.75f;
        boolean isApproved = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Site Name   : " + siteName);
        System.out.println("Location   : " + location);
        System.out.println("Area       : " + area);
        System.out.println("Cost       : " + cost);
        System.out.println("Approved   : " + isApproved);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Site Name   : " + Site.siteName);
        System.out.println("Location   : " + Site.location);
        System.out.println("Area       : " + Site.area);
        System.out.println("Cost       : " + Site.cost);
        System.out.println("Approved   : " + Site.isApproved);
    }
}