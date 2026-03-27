class MouseRunner {

    public static void main(String[] args) {

        Mouse.showMouse();

        Mouse.showPrice(500, 700);

        int stock = Mouse.getStock();
        System.out.println("Stock: " + stock);

        int total = Mouse.totalPrice(500, 2);
        System.out.println("Total Price: " + total);
    }
}