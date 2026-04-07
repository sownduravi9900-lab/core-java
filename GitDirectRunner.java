class GitDirectRunner {

    public static void main(String[] args) {

        int price = GitDirect.checkPizza("Gobi");
        System.out.println("Single Price: " + price);

        int total = GitDirect.calculateBill("margherita", price, 3);
        System.out.println("Total Price: " + total);
    }
}