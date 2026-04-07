class DoorBashRunner {

    public static void main(String[] args) {

        int price = DoorBash.checkPizza("burger");
        System.out.println("Single Price: " + price);

        int total = DoorBash.calculateBill("burger", price, 3);
        System.out.println("Total Price: " + total);
    }
}