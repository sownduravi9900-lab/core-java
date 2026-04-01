class SpotifyRunner {
    public static void main(String[] args) {

        Spotify s1 = new Spotify("Sowndarya", "Ed Sheeran", 240, 4.8, 3000000L, true);
        Spotify s2 = new Spotify("Yashwantha", "The Weeknd", 200, 4.7, 2800000L, false);
        Spotify s3 = new Spotify("Raveesha", "Imagine Dragons", 210, 4.6, 2500000L, true);
        Spotify s4 = new Spotify("Rathnamma", "Arijit Singh", 230, 4.5, 2200000L, false);
        Spotify s5 = new Spotify("Rudra", "Anirudh", 215, 4.4, 2000000L, true);
        Spotify s6 = new Spotify("TumTum", "Arijit Singh", 260, 4.9, 2700000L, true);
        Spotify s7 = new Spotify("Bablu", "Anirudh", 190, 4.3, 1800000L, false);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
    }
}