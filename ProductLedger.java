public class ProductLedger {
    public static void main(String[] args) {

        
        int ledgerId = 1101;
        double balanceAmount = 5600.25;
        String productName = "Printer";
        boolean ledgerActive = true;
        char ledgerGrade = 'A';

     
        System.out.println("Initial Product Ledger:");
        System.out.println("Ledger ID: " + ledgerId);
        System.out.println("Balance Amount: " + balanceAmount);
        System.out.println("Product Name: " + productName);
        System.out.println("Ledger Active: " + ledgerActive);
        System.out.println("Ledger Grade: " + ledgerGrade);

        
        ledgerId = 1102;
        balanceAmount = 6200.75;
        productName = "Laser Printer";
        ledgerActive = false;
        ledgerGrade = 'B';

        System.out.println("\nUpdated Product Ledger:");
        System.out.println("Ledger ID: " + ledgerId);
        System.out.println("Balance Amount: " + balanceAmount);
        System.out.println("Product Name: " + productName);
        System.out.println("Ledger Active: " + ledgerActive);
        System.out.println("Ledger Grade: " + ledgerGrade);
    }
}