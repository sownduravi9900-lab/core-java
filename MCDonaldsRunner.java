class MCDonaldsRunner {

    public static void main(String[] args) {

        int price = MCDonalds.checkPizza("KitKat");
        System.out.println("Single Price: " + price);

        int total = MCDonalds.calculateBill("KitKat", price, 3);
        System.out.println("Total Price: " + total);
    }
}