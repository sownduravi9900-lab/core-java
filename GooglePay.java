class GooglePay {
    String payerName;
    String payeeName;
    String transactionCategory;
    double transferAmount;

    public GooglePay(String payerName, String payeeName, String transactionCategory, double transferAmount) {
        this.payerName = payerName;
        this.payeeName = payeeName;
        this.transactionCategory = transactionCategory;
        this.transferAmount = transferAmount;
        System.out.println("Payment completed successfully using Google Pay");
    }

    public GooglePay(String payerName, String transactionCategory) {
        this.payerName = payerName;
        this.transactionCategory = transactionCategory;
        System.out.println(transactionCategory);
    }

    public GooglePay(String payerName) {
        System.out.println(payerName);
        System.out.println("Welcome to Google Pay!");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}