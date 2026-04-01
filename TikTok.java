class TikTok {
    String creatorName;
    long totalViews;
    float videoDuration;
    int likes;
    boolean isTrending;

    TikTok(String creatorName, long totalViews, float videoDuration, int likes, boolean isTrending) {
        creatorName = creatorName;
        totalViews = totalViews;
        videoDuration = videoDuration;
        likes = likes;
        isTrending = isTrending;
    }

    void display() {
        System.out.println("Creator Name: " + creatorName);
        System.out.println("Total Views: " + totalViews);
        System.out.println("Video Duration: " + videoDuration);
        System.out.println("Likes: " + likes);
        System.out.println("Trending: " + isTrending);
        System.out.println("----------------------");
    }
}