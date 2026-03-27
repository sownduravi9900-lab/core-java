public class StockManager {
    public static void main(String[] args) {

        
        int stockId = 501;
        double unitPrice = 89.75;
        String productName = "USB Cable";
        boolean stockAvailable = true;
        char stockGrade = 'A';

        
        System.out.println("Initial Stock Details:");
        System.out.println("Stock ID: " + stockId);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Product Name: " + productName);
        System.out.println("Stock Available: " + stockAvailable);
        System.out.println("Stock Grade: " + stockGrade);

        
        stockId = 502;
        unitPrice = 99.50;
        productName = "Fast Charging Cable";
        stockAvailable = false;
        stockGrade = 'B';

        System.out.println("\nUpdated Stock Details:");
        System.out.println("Stock ID: " + stockId);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Product Name: " + productName);
        System.out.println("Stock Available: " + stockAvailable);
        System.out.println("Stock Grade: " + stockGrade);
    }
}