class OnlineCart {

    // 3 static variables
    static String site = "ShopNow";
    static int maxItems = 50;
    static boolean offers = true;

    public static void main(String[] args) {

        // 3 local variables
        String item;
        int qty;
        double total;

        item = "Headphones";
        qty = 2;
        total = 2998.00;

        System.out.println("Website   : " + site);
        System.out.println("Max Items : " + maxItems);
        System.out.println("Offers    : " + offers);
        System.out.println("Item      : " + item);
        System.out.println("Quantity  : " + qty);
        System.out.println("Total ₹   : " + total);
    }
}