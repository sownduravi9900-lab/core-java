class CableWire {

    // Static variables
    static int id = 301;
    static String nm = "PowerCable";
    static long ln = 50L;
    static boolean av = true;
    static char ty = 'E';

    public static void main(String[] args) {

        // Local variables (same names)
        int id = 401;
        String nm = "DataCable";
        long ln = 20L;
        boolean av = false;
        char ty = 'D';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("id : " + id);
        System.out.println("nm : " + nm);
        System.out.println("ln : " + ln);
        System.out.println("av : " + av);
        System.out.println("ty : " + ty);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("id : " + CableWirr.id);
        System.out.println("nm : " + CableWirr.nm);
        System.out.println("ln : " + CableWirr.ln);
        System.out.println("av : " + CableWirr.av);
        System.out.println("ty : " + CableWirr.ty);
    }
}