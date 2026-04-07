class ZeptoRunner {

    public static void main(String[] args) {

        int price = Zepto.checkPizza("margherita");
        System.out.println("Single Price: " + price);

        int total = Zepto.calculateBill("margherita", price, 3);
        System.out.println("Total Price: " + total);
    }
}