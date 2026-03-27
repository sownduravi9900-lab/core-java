class MarketPlace {

    // static variables
    static String n = "OpenMarket";
    static int s = 120;          
    static boolean v = true;     

    public static void main(String[] args) {

        // local variables
        String p;
        double pr;
        int q;

        p = "Bluetooth Speaker";
        pr = 2499.00;
        q = 1;

        System.out.println("Name     : " + n);
        System.out.println("Sellers  : " + s);
        System.out.println("Verified : " + v);
        System.out.println("Product  : " + p);
        System.out.println("Price    : " + pr);
        System.out.println("Qty      : " + q);
    }
}