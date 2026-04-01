class YouTube {
    String channelName;
    String videoTitle;
    int views;
    long subscribers;
    double duration;
    boolean isMonetized;
    char quality;

    YouTube(String channelName, String videoTitle, int views, long subscribers,
            double duration, boolean isMonetized, char quality) {
        this.channelName = channelName;
        this.videoTitle = videoTitle;
        this.views = views;
        this.subscribers = subscribers;
        this.duration = duration;
        this.isMonetized = isMonetized;
        this.quality = quality;
    }
    void display() {
        System.out.println(channelName);
        System.out.println(videoTitle);
        System.out.println(views);
        System.out.println(subscribers);
        System.out.println(duration);
        System.out.println(isMonetized);
        System.out.println(quality);
        System.out.println("///////////////////////////////////////");
    }
}