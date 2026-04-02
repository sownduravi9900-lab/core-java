class PhonePe {
    String senderId;
    String beneficiaryId;
    String paymentMode;
    double transactionAmount;

    public PhonePe(String senderId, String beneficiaryId, String paymentMode, double transactionAmount) {
        this.senderId = senderId;
        this.beneficiaryId = beneficiaryId;
        this.paymentMode = paymentMode;
        this.transactionAmount = transactionAmount;
        System.out.println("Payment processed successfully via PhonePe");
    }

    public PhonePe(String senderId, String paymentMode) {
        this.senderId = senderId;
        this.paymentMode = paymentMode;
        System.out.println(paymentMode);
    }

    public PhonePe(String senderId) {
        System.out.println(senderId);
        System.out.println("Welcome to PhonePe account");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}

