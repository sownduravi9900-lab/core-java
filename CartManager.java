public class CartManager {
    public static void main(String[] args) {

        // declaration and initialization
        int cartId = 901;
        double totalAmount = 3499.99;
        String customerName = "Kiran";
        boolean isCheckedOut = false;
        char cartStatus = 'A'; // A = Active, C = Closed

        // printing initial values
        System.out.println("Initial Cart Details:");
        System.out.println("Cart ID: " + cartId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Cart Status: " + cartStatus);

        // reassigning values
        cartId = 902;
        totalAmount = 4125.50;
        customerName = "Sowndu";
        isCheckedOut = true;
        cartStatus = 'C';

        System.out.println("\nUpdated Cart Details:");
        System.out.println("Cart ID: " + cartId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Checked Out: " + isCheckedOut);
        System.out.println("Cart Status: " + cartStatus);
    }
}