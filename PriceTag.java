class PriceTag {

    // Static variables (class variables)
    static int tagId = 8801;
    static String brand = "EasyMart";
    static double mrp = 499.99;
    static boolean taxable = true;
    static char currency = '₹';

    public static void main(String[] args) {

        // Local variables (method variables – different names)
        int qty = 2;
        float discount = 50.0f;
        double finalAmt = 449.99;
        boolean printed = false;
        char status = 'A';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("qty : " + qty);
        System.out.println("discount : " + discount);
        System.out.println("finalAmt : " + finalAmt);
        System.out.println("printed : " + printed);
        System.out.println("status : " + status);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("tagId : " + tagId);
        System.out.println("brand : " + brand);
        System.out.println("mrp : " + mrp);
        System.out.println("taxable : " + taxable);
        System.out.println("currency : " + currency);
    }
}