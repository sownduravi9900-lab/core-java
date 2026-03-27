class KeyChain {

    // Static variables (class variables)
    static int code = 9001;
    static String mat = "Steel";
    static double wt = 45.5;
    static boolean lock = true;
    static char clr = 'B';

    public static void main(String[] args) {

        // Local variables (method variables – different names)
        int qty = 3;
        String owner = "Ravi";
        float cost = 199.99f;
        boolean gift = false;
        char grade = 'A';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("qty : " + qty);
        System.out.println("owner : " + owner);
        System.out.println("cost : " + cost);
        System.out.println("gift : " + gift);
        System.out.println("grade : " + grade);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("code : " + code);
        System.out.println("mat : " + mat);
        System.out.println("wt : " + wt);
        System.out.println("lock : " + lock);
        System.out.println("clr : " + clr);
    }
}