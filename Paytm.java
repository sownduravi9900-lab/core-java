class Paytm {
    String accountHolder;
    String merchantName;
    String serviceType;
    double paymentValue;

    public Paytm(String accountHolder, String merchantName, String serviceType, double paymentValue) {
        this.accountHolder = accountHolder;
        this.merchantName = merchantName;
        this.serviceType = serviceType;
        this.paymentValue = paymentValue;
        System.out.println("Payment done successfully using Paytm");
    }

    public Paytm(String accountHolder, String serviceType) {
        this.accountHolder = accountHolder;
        this.serviceType = serviceType;
        System.out.println(serviceType);
    }

    public Paytm(String accountHolder) {
        System.out.println(accountHolder);
        System.out.println("Welcome to Paytm!");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}
