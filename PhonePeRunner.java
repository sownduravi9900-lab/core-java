class PhonePeRunner {

    public static void main(String[] args) {

        System.out.println("Initiate transaction using PhonePe");

        PhonePe txn1 = new PhonePe("USER123","USER456","UPI Transfer",750.00);

        System.out.println("Check transaction details");

        PhonePe txnCheck = new PhonePe("USER123", "UPI Transfer");
		
        PhonePe userProfile = new PhonePe("USER123");
    }
}