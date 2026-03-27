public class BillingHistory {
    public static void main(String[] args) {

     
        int billNumber = 7801;
        double billAmount = 4599.50;
        String customerName = "Kiran";
        boolean billPaid = true;
        char billType = 'R';

     
        System.out.println("Initial Billing History:");
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bill Paid: " + billPaid);
        System.out.println("Bill Type: " + billType);

  
        billNumber = 7802;
        billAmount = 5200.75;
        customerName = "Sowndu";
        billPaid = false;
        billType = 'C';

        System.out.println("\nUpdated Billing History:");
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bill Paid: " + billPaid);
        System.out.println("Bill Type: " + billType);
    }
}