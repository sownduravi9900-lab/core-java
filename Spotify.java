class Spotify {
    String userName;
    String artist;
    int duration;
    double rating;
    long streams;
    boolean isDownloaded;
    Spotify(String userName, String artist, int duration, double rating,
            long streams, boolean isDownloaded) {
        this.userName = userName;
        this.artist = artist;
        this.duration = duration;
        this.rating = rating;
        this.streams = streams;
        this.isDownloaded = isDownloaded;
    }

    void display() {
        System.out.println(userName);
        System.out.println(artist);
        System.out.println(duration);
        System.out.println(rating);
        System.out.println(streams);
        System.out.println(isDownloaded);
        System.out.println("???????????????????????????");
    }
}