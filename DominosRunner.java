class DominosRunner {

    public static void main(String[] args) {

        int price = Dominos.checkPizza("Munch");
        System.out.println("Single Price: " + price);

        int total = Dominos.calculateBill("Munch", price, 3);
        System.out.println("Total Price: " + total);
    }
}