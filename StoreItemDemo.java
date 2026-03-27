public class StoreItemDemo {
    public static void main(String[] args) {

        // declaration and initialization
        int itemId = 301;
        double itemPrice = 249.99;
        String itemName = "Bluetooth Speaker";
        boolean inStock = true;
        char itemGrade = 'A';

        // printing initial values
        System.out.println("Initial Store Item Details:");
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Item Name: " + itemName);
        System.out.println("In Stock: " + inStock);
        System.out.println("Item Grade: " + itemGrade);

        // reassigning values
        itemId = 302;
        itemPrice = 299.50;
        itemName = "Wireless Speaker";
        inStock = false;
        itemGrade = 'B';

        System.out.println("\nUpdated Store Item Details:");
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Item Name: " + itemName);
        System.out.println("In Stock: " + inStock);
        System.out.println("Item Grade: " + itemGrade);
    }
}