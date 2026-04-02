class PaytmRunner {

    public static void main(String[] args) {

        System.out.println("Make your payment using Paytm");

        Paytm payment1 = new Paytm("Sowndarya","Amazon","Shopping",1200.00);

        System.out.println("Check payment details");

        Paytm check = new Paytm("Sowndarya", "Shopping");
		
        Paytm profile = new Paytm("Sowndarya");
    }
}