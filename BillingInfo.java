public class BillingInfo {
    public static void main(String[] args) {

        
        int billNumber = 3001;
        double totalBill = 4250.00;
        String customerName = "Anil";
        boolean paymentDone = true;
        char billType = 'A';

       
        System.out.println("Initial Billing Info:");
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Payment Done: " + paymentDone);
        System.out.println("Bill Type: " + billType);

        
        billNumber = 3002;
        totalBill = 4800.75;
        customerName = "Sowndu";
        paymentDone = false;
        billType = 'B';

        System.out.println("\nUpdated Billing Info:");
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Payment Done: " + paymentDone);
        System.out.println("Bill Type: " + billType);
    }
}