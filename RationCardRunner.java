class RationCardRunner {
    public static void main(String[] args) {

        RationCard r1 = new RationCard();
        r1.headName = "Ravi";
        r1.cardNumber = 111111111111L;
        r1.cardType = "APL";
        r1.familyMembers = 4;
        r1.address = "Mysore";
        r1.district = "Mysore";
        r1.mobileNumber = 9876543210L;

        RationCard r2 = new RationCard();
        r2.headName = "Anu";
        r2.cardNumber = 222222222222L;
        r2.cardType = "BPL";
        r2.familyMembers = 5;
        r2.address = "Mandya";
        r2.district = "Mandya";
        r2.mobileNumber = 9123456780L;

        RationCard r3 = new RationCard();
        r3.headName = "Rahul";
        r3.cardNumber = 333333333333L;
        r3.cardType = "APL";
        r3.familyMembers = 3;
        r3.address = "Bangalore";
        r3.district = "Bangalore";
        r3.mobileNumber = 9988776655L;

        RationCard r4 = new RationCard();
        r4.headName = "Sneha";
        r4.cardNumber = 444444444444L;
        r4.cardType = "BPL";
        r4.familyMembers = 6;
        r4.address = "Hassan";
        r4.district = "Hassan";
        r4.mobileNumber = 8877665544L;

        RationCard r5 = new RationCard();
        r5.headName = "Kiran";
        r5.cardNumber = 555555555555L;
        r5.cardType = "APL";
        r5.familyMembers = 2;
        r5.address = "Udupi";
        r5.district = "Udupi";
        r5.mobileNumber = 7766554433L;

        RationCard r6 = new RationCard();
        r6.headName = "Divya";
        r6.cardNumber = 666666666666L;
        r6.cardType = "BPL";
        r6.familyMembers = 5;
        r6.address = "Tumkur";
        r6.district = "Tumkur";
        r6.mobileNumber = 6655443322L;

        RationCard r7 = new RationCard();
        r7.headName = "Arjun";
        r7.cardNumber = 777777777777L;
        r7.cardType = "APL";
        r7.familyMembers = 4;
        r7.address = "Mangalore";
        r7.district = "Mangalore";
        r7.mobileNumber = 5544332211L;


        // Printing Details
        RationCard[] list = {r1, r2, r3, r4, r5, r6, r7};

        for (RationCard r : list) {
            System.out.println("----- Ration Card Details -----");
            System.out.println("Head Name: " + r.headName);
            System.out.println("Card Number: " + r.cardNumber);
            System.out.println("Card Type: " + r.cardType);
            System.out.println("Family Members: " + r.familyMembers);
            System.out.println("Address: " + r.address);
            System.out.println("District: " + r.district);
            System.out.println("Mobile: " + r.mobileNumber);
        }
    }
}