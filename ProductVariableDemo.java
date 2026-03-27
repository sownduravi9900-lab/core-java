public class ProductVariableDemo {
    public static void main(String[] args) {
        
        int quantity = 5;
        double cost = 499.99;
        String itemName = "Headphones";
        boolean available = true;
        char rating = 'A';

        
        System.out.println("Initial Values:");
        System.out.println("Quantity: " + quantity);
        System.out.println("Cost: " + cost);
        System.out.println("Item Name: " + itemName);
        System.out.println("Available: " + available);
        System.out.println("Rating: " + rating);

       
        quantity = 12;
        cost = 599.50;
        itemName = "Wireless Headphones";
        available = false;
        rating = 'B';

        System.out.println("\nUpdated Values:");
        System.out.println("Quantity: " + quantity);
        System.out.println("Cost: " + cost);
        System.out.println("Item Name: " + itemName);
        System.out.println("Available: " + available);
        System.out.println("Rating: " + rating);
    }
}