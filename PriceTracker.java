class PriceTracker {

    // static variables
    static String s = "PriceTracker";
    static boolean a = true;     // tracking active
    static int d = 7;            // tracking days

    public static void main(String[] args) {

        // local variables
        String p;
        double op;
        double cp;

        p = "Laptop";
        op = 65000.00;           // old price
        cp = 58999.00;           // current price

        System.out.println("System   : " + s);
        System.out.println("Active   : " + a);
        System.out.println("Days     : " + d);
        System.out.println("Product  : " + p);
        System.out.println("Old ₹    : " + op);
        System.out.println("Current ₹: " + cp);
    }
}