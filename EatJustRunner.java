class EatJustRunner {

    public static void main(String[] args) {

        int price = EatJust.checkPizza("salad");
        System.out.println("Single Price: " + price);

        int total = EatJust.calculateBill("salad", price, 3);
        System.out.println("Total Price: " + total);
    }
}