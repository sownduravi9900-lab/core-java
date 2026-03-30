class CreditSystemRunner {

    public static void main(String[] args) {

        CreditSystem c1 = new CreditSystem();

        c1.customerName = "Ravi";
        c1.cardNumber = 1111222233334444L;
        c1.bankName = "HDFC";
        c1.creditLimit = 100000;
        c1.outstandingAmount = 25000;
        c1.isCardActive = true;
        c1.creditScore = 750;

        CreditSystem c2 = new CreditSystem();

        c2.customerName = "Sowndu";
        c2.cardNumber = 5555666677778888L;
        c2.bankName = "ICICI";
        c2.creditLimit = 150000;
        c2.outstandingAmount = 50000;
        c2.isCardActive = false;
        c2.creditScore = 720;

        CreditSystem c3 = new CreditSystem();

        c3.customerName = "Vidhya";
        c3.cardNumber = 9999000011112222L;
        c3.bankName = "SBI";
        c3.creditLimit = 80000;
        c3.outstandingAmount = 10000;
        c3.isCardActive = true;
        c3.creditScore = 780;

        CreditSystem c4 = new CreditSystem();

        c4.customerName = "John";
        c4.cardNumber = 3333444455556666L;
        c4.bankName = "Axis";
        c4.creditLimit = 120000;
        c4.outstandingAmount = 30000;
        c4.isCardActive = true;
        c4.creditScore = 700;

        System.out.println("***** Printing Credit System Details *****");

        System.out.println("c1 Name: " + c1.customerName);
        System.out.println("c1 Card Number: " + c1.cardNumber);
        System.out.println("c1 Bank: " + c1.bankName);
        System.out.println("c1 Credit Limit: " + c1.creditLimit);
        System.out.println("c1 Outstanding: " + c1.outstandingAmount);
        System.out.println("c1 Active: " + c1.isCardActive);
        System.out.println("c1 Credit Score: " + c1.creditScore);

        System.out.println("***** Printing Credit System Details *****");

        System.out.println("c2 Name: " + c2.customerName);
        System.out.println("c2 Card Number: " + c2.cardNumber);
        System.out.println("c2 Bank: " + c2.bankName);
        System.out.println("c2 Credit Limit: " + c2.creditLimit);
        System.out.println("c2 Outstanding: " + c2.outstandingAmount);
        System.out.println("c2 Active: " + c2.isCardActive);
        System.out.println("c2 Credit Score: " + c2.creditScore);

        System.out.println("***** Printing Credit System Details *****");

        System.out.println("c3 Name: " + c3.customerName);
        System.out.println("c3 Card Number: " + c3.cardNumber);
        System.out.println("c3 Bank: " + c3.bankName);
        System.out.println("c3 Credit Limit: " + c3.creditLimit);
        System.out.println("c3 Outstanding: " + c3.outstandingAmount);
        System.out.println("c3 Active: " + c3.isCardActive);
        System.out.println("c3 Credit Score: " + c3.creditScore);

        System.out.println("***** Printing Credit System Details *****");

        System.out.println("c4 Name: " + c4.customerName);
        System.out.println("c4 Card Number: " + c4.cardNumber);
        System.out.println("c4 Bank: " + c4.bankName);
        System.out.println("c4 Credit Limit: " + c4.creditLimit);
        System.out.println("c4 Outstanding: " + c4.outstandingAmount);
        System.out.println("c4 Active: " + c4.isCardActive);
        System.out.println("c4 Credit Score: " + c4.creditScore);
    }
}