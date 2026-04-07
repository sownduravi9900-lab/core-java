class KFCRunner {

    public static void main(String[] args) {

        int price = KFC.checkPizza("chicken bucket");
        System.out.println("Single Price: " + price);

        int total = KFC.calculateBill("chicken bucket", price, 3);
        System.out.println("Total Price: " + total);
    }
}