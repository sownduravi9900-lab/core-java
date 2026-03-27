class Billing {
public static void main(String[] args) {


        byte billId = 1;

        long invoiceNumber = 20260221001L;
        float discount = 5.0f;
		short totalItems = 8;
        int billNumber = 45678;
        double totalAmount = 1250.75;
        char paymentMode = 'C'; 
        boolean isPaid = true;

        System.out.println(billId);
        System.out.println(invoiceNumber);
	    System.out.println(totalItems);
        System.out.println(billNumber);
        System.out.println(discount );
        System.out.println(totalAmount);
        System.out.println(paymentMode);
        System.out.println(isPaid);
    }
}