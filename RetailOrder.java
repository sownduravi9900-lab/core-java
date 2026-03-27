public class RetailOrder {
    public static void main(String[] args) {

       
        int orderNumber = 4501;
        double orderTotal = 2899.99;
        String customerName = "Kiran";
        boolean orderPlaced = true;
        char orderPriority = 'A';

     
        System.out.println("Initial Retail Order:");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Order Total: " + orderTotal);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Placed: " + orderPlaced);
        System.out.println("Order Priority: " + orderPriority);

   
        orderNumber = 4502;
        orderTotal = 3150.75;
        customerName = "Sowndu";
        orderPlaced = false;
        orderPriority = 'B';

        System.out.println("\nUpdated Retail Order:");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Order Total: " + orderTotal);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Placed: " + orderPlaced);
        System.out.println("Order Priority: " + orderPriority);
    }
}