class Twitter {
    String handle;
    int tweetsCount;
    long impressions;
    double engagementRate;
    boolean isVerified;

    Twitter(String handle, int tweetsCount, long impressions, double engagementRate, boolean isVerified) {
        this.handle = handle;
        this.tweetsCount = tweetsCount;
        this.impressions = impressions;
        this.engagementRate = engagementRate;
        this.isVerified = isVerified;
    }

    void display() {
        System.out.println("Handle: " + handle);
        System.out.println("Tweets Count: " + tweetsCount);
        System.out.println("Impressions: " + impressions);
        System.out.println("Engagement Rate: " + engagementRate);
        System.out.println("Verified: " + isVerified);
        System.out.println("----------------------");
    }
}