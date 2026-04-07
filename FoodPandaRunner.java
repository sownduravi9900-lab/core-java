class FoodPandaRunner {

    public static void main(String[] args) {

        int price = FoodPanda.checkPizza("margherita");
        System.out.println("Single Price: " + price);

        int total = FoodPanda.calculateBill("margherita", price, 3);
        System.out.println("Total Price: " + total);
    }
}