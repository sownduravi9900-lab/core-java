class GooglePayRunner {

    public static void main(String[] args) {

        System.out.println("Make your payment using Google Pay");

        GooglePay payment1 = new GooglePay("Sowndarya","Ravi","UPI Payment",650.00);

        System.out.println("Check transaction");

        GooglePay check = new GooglePay("Sowndarya", "UPI Payment");
		
        GooglePay profile = new GooglePay("Sowndarya");
    }
}