public class SalesRecord {
    public static void main(String[] args) {

        
        int saleId = 901;
        double saleAmount = 8750.50;
        String salesPerson = "Anita";
        boolean paymentReceived = true;
        char performanceGrade = 'A';

     
        System.out.println("Initial Sales Record:");
        System.out.println("Sale ID: " + saleId);
        System.out.println("Sale Amount: " + saleAmount);
        System.out.println("Sales Person: " + salesPerson);
        System.out.println("Payment Received: " + paymentReceived);
        System.out.println("Performance Grade: " + performanceGrade);

    
        saleId = 902;
        saleAmount = 9200.75;
        salesPerson = "Ravi";
        paymentReceived = false;
        performanceGrade = 'B';

        System.out.println("\nUpdated Sales Record:");
        System.out.println("Sale ID: " + saleId);
        System.out.println("Sale Amount: " + saleAmount);
        System.out.println("Sales Person: " + salesPerson);
        System.out.println("Payment Received: " + paymentReceived);
        System.out.println("Performance Grade: " + performanceGrade);
    }
}