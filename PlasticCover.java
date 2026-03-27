class PlasticCover {

    // Static variables
    static int id = 501;
    static String nm = "Transparent";
    static long pr = 120L;
    static boolean av = true;
    static char ty = 'S';

    public static void main(String[] args) {

        // Local variables (same names)
        int id = 601;
        String nm = "Colored";
        long pr = 180L;
        boolean av = false;
        char ty = 'L';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("id : " + id);
        System.out.println("nm : " + nm);
        System.out.println("pr : " + pr);
        System.out.println("av : " + av);
        System.out.println("ty : " + ty);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("id : " + Plasticcover.id);
        System.out.println("nm : " + Plasticcover.nm);
        System.out.println("pr : " + Plasticcover.pr);
        System.out.println("av : " + Plasticcover.av);
        System.out.println("ty : "