class PaymentInfo {

    // Static variables
    static int id = 1001;
    static String md = "UPI";
    static double am = 2500.00;
    static boolean ok = true;
    static char st = 'S';

    public static void main(String[] args) {

        // Local variables (same names)
        int id = 2002;
        String md = "Card";
        double am = 1800.50;
        boolean ok = false;
        char st = 'F';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("id : " + id);
        System.out.println("md : " + md);
        System.out.println("am : " + am);
        System.out.println("ok : " + ok);
        System.out.println("st : " + st);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("id : " + PaymentInfo.id);
        System.out.println("md : " + PaymentInfo.md);
        System.out.println("am : " + PaymentInfo.am);
        System.out.println("ok : " + PaymentInfo.ok);
        System.out.println("st : " + PaymentInfo.st);
    }
}