public class ExpenseMonitor {
    public static void main(String[] args) {

      
        int expenseId = 101;
        double expenseAmount = 1250.75;
        String expenseCategory = "Food";
        boolean isApproved = true;
        char paymentMode = 'C'; 

   
        System.out.println("Initial Expense Details:");
        System.out.println("Expense ID: " + expenseId);
        System.out.println("Expense Amount: " + expenseAmount);
        System.out.println("Expense Category: " + expenseCategory);
        System.out.println("Approved: " + isApproved);
        System.out.println("Payment Mode: " + paymentMode);

   
        expenseId = 102;
        expenseAmount = 1899.50;
        expenseCategory = "Travel";
        isApproved = false;
        paymentMode = 'O';

        System.out.println("\nUpdated Expense Details:");
        System.out.println("Expense ID: " + expenseId);
        System.out.println("Expense Amount: " + expenseAmount);
        System.out.println("Expense Category: " + expenseCategory);
        System.out.println("Approved: " + isApproved);
        System.out.println("Payment Mode: " + paymentMode);
    }
}