class BazaarNowRunner {

    public static void main(String[] args) {

        int price = BazaarNow.checkPizza("Mixtures");
        System.out.println("Single Price: " + price);

        int total = BazaarNow.calculateBill("Mixtures", price, 3);
        System.out.println("Total Price: " + total);
    }
}