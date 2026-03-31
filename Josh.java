class Josh {
    String userId;
    int videoCount;
    double earnings;
    char category;
    boolean isPopular;

    Josh(String userId, int videoCount, double earnings, char category, boolean isPopular) {
        this.userId = userId;
        this.videoCount = videoCount;
        this.earnings = earnings;
        this.category = category;
        this.isPopular = isPopular;
    }
    void display() {
        System.out.println("User ID: " + userId);
        System.out.println("Video Count: " + videoCount);
        System.out.println("Earnings: " + earnings);
        System.out.println("Category: " + category);
        System.out.println("Popular: " + isPopular);
        System.out.println("----------------------");
    }
}