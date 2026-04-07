class BlinkItRunner {

    public static void main(String[] args) {

        int price = BlinkIt.checkPizza("VegPizza");
        System.out.println("Single Price: " + price);

        int total = BlinkIt.calculateBill("VegPizza", price, 3);
        System.out.println("Total Price: " + total);
    }
}