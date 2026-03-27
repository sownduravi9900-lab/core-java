class WaterBottle {

    // Static variables
    static String tp = "Steel";
    static int cp = 1;
    static float pr = 350.50f;
    static boolean ht = true;
    static char gd = 'A';

    public static void main(String[] args) {

        // Local variables (same names)
        String tp = "Plastic";
        int cp = 2;
        float pr = 150.00f;
        boolean ht = false;
        char gd = 'B';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("tp : " + tp);
        System.out.println("cp : " + cp);
        System.out.println("pr : " + pr);
        System.out.println("ht : " + ht);
        System.out.println("gd : " + gd);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("tp : " + WaterBottle.tp);
        System.out.println("cp : " + WaterBottle.cp);
        System.out.println("pr : " + WaterBottle.pr);
        System.out.println("ht : " + WaterBottle.ht);
        System.out.println("gd : " + WaterBottle.gd);
    }
}