class Photoframe {

    // Static variables
    static int id = 11;
    static String nm = "ClassicFrame";
    static long pr = 1500L;
    static boolean av = true;
    static char sz = 'M';

    public static void main(String[] args) {

        // Local variables (same names)
        int id = 22;
        String nm = "ModernFrame";
        long pr = 2300L;
        boolean av = false;
        char sz = 'L';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("id : " + id);
        System.out.println("nm : " + nm);
        System.out.println("pr : " + pr);
        System.out.println("av : " + av);
        System.out.println("sz : " + sz);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("id : " + Photoframe.id);
        System.out.println("nm : " + Photoframe.nm);
        System.out.println("pr : " + Photoframe.pr);
        System.out.println("av : " + Photoframe.av);
        System.out.println("sz : " + Photoframe.sz);
    }
}