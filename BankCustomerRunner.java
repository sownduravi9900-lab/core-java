class BankCustomerRunner {

    public static void main(String[] args) {

        BankCustomer c1 = new BankCustomer();

        c1.customerName = "Ravi";
        c1.accountNumber = 1234567890L;
        c1.bankName = "SBI";
        c1.branch = "Bangalore";
        c1.balance = 50000;
        c1.isActive = true;
        c1.accountType = "Savings";

        BankCustomer c2 = new BankCustomer();

        c2.customerName = "Sowndu";
        c2.accountNumber = 2234567890L;
        c2.bankName = "HDFC";
        c2.branch = "Chennai";
        c2.balance = 75000;
        c2.isActive = true;
        c2.accountType = "Current";

        BankCustomer c3 = new BankCustomer();

        c3.customerName = "Vidhya";
        c3.accountNumber = 3234567890L;
        c3.bankName = "ICICI";
        c3.branch = "Hyderabad";
        c3.balance = 62000;
        c3.isActive = false;
        c3.accountType = "Savings";

        BankCustomer c4 = new BankCustomer();

        c4.customerName = "John";
        c4.accountNumber = 4234567890L;
        c4.bankName = "Axis";
        c4.branch = "Mumbai";
        c4.balance = 88000;
        c4.isActive = true;
        c4.accountType = "Current";

        System.out.println("***** Printing Bank Customer Details *****");

        System.out.println("c1 Name: " + c1.customerName);
        System.out.println("c1 Account Number: " + c1.accountNumber);
        System.out.println("c1 Bank: " + c1.bankName);
        System.out.println("c1 Branch: " + c1.branch);
        System.out.println("c1 Balance: " + c1.balance);
        System.out.println("c1 Active: " + c1.isActive);
        System.out.println("c1 Account Type: " + c1.accountType);

        System.out.println("***** Printing Bank Customer Details *****");

        System.out.println("c2 Name: " + c2.customerName);
        System.out.println("c2 Account Number: " + c2.accountNumber);
        System.out.println("c2 Bank: " + c2.bankName);
        System.out.println("c2 Branch: " + c2.branch);
        System.out.println("c2 Balance: " + c2.balance);
        System.out.println("c2 Active: " + c2.isActive);
        System.out.println("c2 Account Type: " + c2.accountType);

        System.out.println("***** Printing Bank Customer Details *****");

        System.out.println("c3 Name: " + c3.customerName);
        System.out.println("c3 Account Number: " + c3.accountNumber);
        System.out.println("c3 Bank: " + c3.bankName);
        System.out.println("c3 Branch: " + c3.branch);
        System.out.println("c3 Balance: " + c3.balance);
        System.out.println("c3 Active: " + c3.isActive);
        System.out.println("c3 Account Type: " + c3.accountType);

        System.out.println("***** Printing Bank Customer Details *****");

        System.out.println("c4 Name: " + c4.customerName);
        System.out.println("c4 Account Number: " + c4.accountNumber);
        System.out.println("c4 Bank: " + c4.bankName);
        System.out.println("c4 Branch: " + c4.branch);
        System.out.println("c4 Balance: " + c4.balance);
        System.out.println("c4 Active: " + c4.isActive);
        System.out.println("c4 Account Type: " + c4.accountType);
    }
}