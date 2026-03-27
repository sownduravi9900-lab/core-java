class OrderManager {

    // static variables
    static String s = "OrderSystem";
    static int m = 500;          // max orders per day
    static boolean a = true;     // system active

    public static void main(String[] args) {

        // local variables
        int o;
        double t;
        String c;

        o = 10245;               // order id
        t = 3499.75;             // total amount
        c = "Confirmed";         // order status

        System.out.println("System   : " + s);
        System.out.println("MaxOrder : " + m);
        System.out.println("Active   : " + a);
        System.out.println("Order ID : " + o);
        System.out.println("Total ₹  : " + t);
        System.out.println("Status   : " + c);
    }
}