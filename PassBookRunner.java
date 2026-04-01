class PassBookRunner {
    public static void main(String[] args) {

        PassBook p1 = new PassBook();
        p1.accountHolderName = "Ravi";
        p1.accountNumber = 11111111111L;
        p1.bankName = "SBI";
        p1.branchName = "Mysore";
        p1.balance = 50000.50;
        p1.ifscCode = "SBIN0001111";
        p1.mobileNumber = 9876543210L;

        PassBook p2 = new PassBook();
        p2.accountHolderName = "Anu";
        p2.accountNumber = 22222222222L;
        p2.bankName = "HDFC";
        p2.branchName = "Mandya";
        p2.balance = 65000.75;
        p2.ifscCode = "HDFC0002222";
        p2.mobileNumber = 9123456780L;

        PassBook p3 = new PassBook();
        p3.accountHolderName = "Rahul";
        p3.accountNumber = 33333333333L;
        p3.bankName = "ICICI";
        p3.branchName = "Bangalore";
        p3.balance = 72000.00;
        p3.ifscCode = "ICIC0003333";
        p3.mobileNumber = 9988776655L;

        PassBook p4 = new PassBook();
        p4.accountHolderName = "Sneha";
        p4.accountNumber = 44444444444L;
        p4.bankName = "Axis";
        p4.branchName = "Hassan";
        p4.balance = 43000.25;
        p4.ifscCode = "UTIB0004444";
        p4.mobileNumber = 8877665544L;

        PassBook p5 = new PassBook();
        p5.accountHolderName = "Kiran";
        p5.accountNumber = 55555555555L;
        p5.bankName = "Canara";
        p5.branchName = "Udupi";
        p5.balance = 81000.90;
        p5.ifscCode = "CNRB0005555";
        p5.mobileNumber = 7766554433L;

        PassBook p6 = new PassBook();
        p6.accountHolderName = "Divya";
        p6.accountNumber = 66666666666L;
        p6.bankName = "PNB";
        p6.branchName = "Tumkur";
        p6.balance = 39000.60;
        p6.ifscCode = "PUNB0006666";
        p6.mobileNumber = 6655443322L;

        PassBook p7 = new PassBook();
        p7.accountHolderName = "Arjun";
        p7.accountNumber = 77777777777L;
        p7.bankName = "Kotak";
        p7.branchName = "Mangalore";
        p7.balance = 92000.10;
        p7.ifscCode = "KKBK0007777";
        p7.mobileNumber = 5544332211L;
    
        PassBook[] books = {p1, p2, p3, p4, p5, p6, p7};

        for (PassBook p : books) {
            System.out.println("----- PassBook Details -----");
            System.out.println("Name: " + p.accountHolderName);
            System.out.println("Account No: " + p.accountNumber);
            System.out.println("Bank: " + p.bankName);
            System.out.println("Branch: " + p.branchName);
            System.out.println("Balance: " + p.balance);
            System.out.println("IFSC: " + p.ifscCode);
            System.out.println("Mobile: " + p.mobileNumber);
        }
    }
}