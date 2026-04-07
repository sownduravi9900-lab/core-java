class MagicPinRunner {

    public static void main(String[] args) {

        int price = MagicPin.checkPizza("pani puri");
        System.out.println("Single Price: " + price);

        int total = MagicPin.calculateBill("pani puri", price, 3);
        System.out.println("Total Price: " + total);
    }
}