class AmazonRunner {
    public static void main(String[] args) {

        Amazon a1 = new Amazon("Laptop", 1, 55000.50, 'E', true);
        Amazon a2 = new Amazon("Shoes", 2, 2999.99, 'F', false);
        Amazon a3 = new Amazon("Mobile", 1, 20000.00, 'E', true);
        Amazon a4 = new Amazon("Book", 3, 499.75, 'B', false);
        Amazon a5 = new Amazon("Watch", 1, 1500.60, 'A', true);
        Amazon a6 = new Amazon("Headphones", 2, 2500.40, 'E', true);
        Amazon a7 = new Amazon("Bag", 1, 1200.00, 'F', false);

        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();
        a6.display();
        a7.display();
    }
}