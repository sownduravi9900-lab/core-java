class Twitter {
    String handle;
    int tweetsCount;
    long impressions;
    double engagementRate;
    boolean isVerified;

    Twitter(String handle, int tweetsCount, long impressions, double engagementRate, boolean isVerified) {
        handle = handle;
        tweetsCount = tweetsCount;
        impressions = impressions;
        engagementRate = engagementRate;
        isVerified = isVerified;
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