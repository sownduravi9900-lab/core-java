class Meesho {
    String sellerName;
    int orders;
    double totalEarnings;
    char ratingGrade;
    boolean isTopSeller;
    Meesho(String sellerName, int orders, double totalEarnings, char ratingGrade, boolean isTopSeller) {
        this.sellerName = sellerName;
        this.orders = orders;
        this.totalEarnings = totalEarnings;
        this.ratingGrade = ratingGrade;
        this.isTopSeller = isTopSeller;
    }
    void display() {
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Orders: " + orders);
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Rating Grade: " + ratingGrade);
        System.out.println("Top Seller: " + isTopSeller);
        System.out.println("----------------------");
    }
}