class RetailShop {

    // static variables
    static String n = "City Retail";
    static int i = 1500;        // total items
    static boolean o = true;    // shop open

    public static void main(String[] args) {

        // local variables
        String p;
        double pr;
        int q;

        p = "T-Shirt";
        pr = 799.00;
        q = 3;

        System.out.println("Shop Name : " + n);
        System.out.println("Items     : " + i);
        System.out.println("Open      : " + o);
        System.out.println("Product   : " + p);
        System.out.println("Price ₹   : " + pr);
        System.out.println("Quantity  : " + q);
    }
}