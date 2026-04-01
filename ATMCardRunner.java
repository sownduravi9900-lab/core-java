class ATMCardRunner {
    public static void main(String[] args) {

        ATMCard c1 = new ATMCard();
        c1.cardHolderName = "Ravi";
        c1.cardNumber = 1111222233334444L;
        c1.bankName = "SBI";
        c1.expiryDate = "12/28";
        c1.pin = 1234;
        c1.cardType = "Debit";
        c1.branchName = "Mysore";

        ATMCard c2 = new ATMCard();
        c2.cardHolderName = "Anu";
        c2.cardNumber = 2222333344445555L;
        c2.bankName = "HDFC";
        c2.expiryDate = "11/27";
        c2.pin = 2345;
        c2.cardType = "Credit";
        c2.branchName = "Mandya";

        ATMCard c3 = new ATMCard();
        c3.cardHolderName = "Rahul";
        c3.cardNumber = 3333444455556666L;
        c3.bankName = "ICICI";
        c3.expiryDate = "10/29";
        c3.pin = 3456;
        c3.cardType = "Debit";
        c3.branchName = "Bangalore";

        ATMCard c4 = new ATMCard();
        c4.cardHolderName = "Sneha";
        c4.cardNumber = 4444555566667777L;
        c4.bankName = "Axis";
        c4.expiryDate = "09/26";
        c4.pin = 4567;
        c4.cardType = "Credit";
        c4.branchName = "Hassan";

        ATMCard c5 = new ATMCard();
        c5.cardHolderName = "Kiran";
        c5.cardNumber = 5555666677778888L;
        c5.bankName = "Canara";
        c5.expiryDate = "08/30";
        c5.pin = 5678;
        c5.cardType = "Debit";
        c5.branchName = "Udupi";

        ATMCard c6 = new ATMCard();
        c6.cardHolderName = "Divya";
        c6.cardNumber = 6666777788889999L;
        c6.bankName = "PNB";
        c6.expiryDate = "07/28";
        c6.pin = 6789;
        c6.cardType = "Credit";
        c6.branchName = "Tumkur";

        ATMCard c7 = new ATMCard();
        c7.cardHolderName = "Arjun";
        c7.cardNumber = 7777888899990000L;
        c7.bankName = "Kotak";
        c7.expiryDate = "06/27";
        c7.pin = 7890;
        c7.cardType = "Debit";
        c7.branchName = "Mangalore";


        ATMCard[] cards = {c1, c2, c3, c4, c5, c6, c7};

        for (ATMCard c : cards) {
            System.out.println("----- ATM Card Details -----");
            System.out.println("Name: " + c.cardHolderName);
            System.out.println("Card Number: " + c.cardNumber);
            System.out.println("Bank: " + c.bankName);
            System.out.println("Expiry: " + c.expiryDate);
            System.out.println("PIN: " + c.pin);
            System.out.println("Type: " + c.cardType);
            System.out.println("Branch: " + c.branchName);
        }
    }
}