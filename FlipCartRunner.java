class FlipCartRunner {
    public static void main(String[] args) {

        FlipCart f1 = new FlipCart("Laptop", 10, 45000.50, 4.5f, true);
        FlipCart f2 = new FlipCart("Mobile", 15, 20000.00, 4.2f, true);
        FlipCart f3 = new FlipCart("Shoes", 25, 2999.99, 3.9f, true);
        FlipCart f4 = new FlipCart("Watch", 8, 1500.75, 4.0f, false);
        FlipCart f5 = new FlipCart("Headphones", 20, 2500.60, 4.3f, true);
        FlipCart f6 = new FlipCart("Bag", 12, 1200.40, 3.8f, true);
        FlipCart f7 = new FlipCart("Book", 30, 499.99, 4.7f, true);

        f1.display();
        f2.display();
        f3.display();
        f4.display();
        f5.display();
        f6.display();
        f7.display();
    }
}