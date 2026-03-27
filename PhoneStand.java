class PhoneStand {

    // Static variables
    static int standId = 101;
    static String material = "Aluminium";
    static double height = 15.5; 
    static boolean adjustable = true;
    static char colorCode = 'Silver'; 

    public static void main(String[] args) {

        // Local variables 
        int quality = 3;
        String owner = "Sowndu";
        float price = 299.99f;
        boolean portable = true;
        char rating = 'A';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("quality : " + quality);
        System.out.println("owner : " + owner);
        System.out.println("price : " + price);
        System.out.println("portable : " + portable);
        System.out.println("rating : " + rating);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("standId : " + standId);
        System.out.println("material : " + material);
        System.out.println("height : " + height);
        System.out.println("adjustable : " + adjustable);
        System.out.println("colorCode : " + colorCode);
    }
}