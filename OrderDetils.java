public class OrderDetails {
    public static void main(String[] args) {

        // declaration and initialization
        int orderId = 101;
        double totalAmount = 1500.75;
        String customerName = "Ravi";
        boolean orderConfirmed = true;
        char orderGrade = 'A';

        // printing initial values
        System.out.println("Initial Order Details:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Confirmed: " + orderConfirmed);
        System.out.println("Order Grade: " + orderGrade);

        // reassigning values
        orderId = 102;
        totalAmount = 2000.50;
        customerName = "Sowndu";
        orderConfirmed = false;
        orderGrade = 'B';

        System.out.println("\nUpdated Order Details:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Confirmed: " + orderConfirmed);
        System.out.println("Order Grade: " + orderGrade);
    }
}