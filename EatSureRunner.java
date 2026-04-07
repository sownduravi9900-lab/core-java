lass EatSureRunner {

    public static void main(String[] args) {

        int price = EatSure.checkPizza("idli");
        System.out.println("Single Price: " + price);

        int total = EatSure.calculateBill("idli", price, 3);
        System.out.println("Total Price: " + total);
    }
}