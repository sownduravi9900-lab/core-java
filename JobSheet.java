class JobSheet {

    // Static variables
    static int id = 501;
    static String nm = "Welding";
    static float hr = 6.5f;
    static double pay = 2500.00;
    static boolean ok = true;

    public static void main(String[] args) {

        // Local variables (same names)
        int id = 702;
        String nm = "Painting";
        float hr = 4.0f;
        double pay = 1800.00;
        boolean ok = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("id  : " + id);
        System.out.println("nm  : " + nm);
        System.out.println("hr  : " + hr);
        System.out.println("pay : " + pay);
        System.out.println("ok  : " + ok);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("id  : " + JobSheet.id);
        System.out.println("nm  : " + JobSheet.nm);
        System.out.println("hr  : " + JobSheet.hr);
        System.out.println("pay : " + JobSheet.pay);
        System.out.println("ok  : " + JobSheet.ok);
    }
}