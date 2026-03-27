class CustomerId {

    // Static variables
    static int id = 101;
    static String nm = "Ravi";
    static long mb = 9876543210L;
    static boolean ac = true;
    static char ty = 'P';

    public static void main(String[] args) {

        // Local variables (same names)
        int id = 202;
        String nm = "Sowndu";
        long mb = 9123456789L;
        boolean ac = false;
        char ty = 'T';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("id : " + id);
        System.out.println("nm : " + nm);
        System.out.println("mb : " + mb);
        System.out.println("ac : " + ac);
        System.out.println("ty : " + ty);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("id : " + CustomerId.id);
        System.out.println("nm : " + CustomerId.nm);
        System.out.println("mb : " + CustomerId.mb);
        System.out.println("ac : " + CustomerId.ac);
        System.out.println("ty : " + CustomerId.ty);
    }
}