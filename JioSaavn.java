class JioSaavn {
    String userName;
    String singer;
    String language;
    int duration;
    double rating;
    long plays;
    boolean isFavorite;

    JioSaavn(String userName, String singer, String language, int duration,
             double rating, long plays, boolean isFavorite) {
        this.userName = userName;
        this.singer = singer;
        this.language = language;
        this.duration = duration;
        this.rating = rating;
        this.plays = plays;
        this.isFavorite = isFavorite;
    }

    void display() {
        System.out.println(userName);
        System.out.println(singer);
        System.out.println(language);
        System.out.println(duration);
        System.out.println(rating);
        System.out.println(plays);
        System.out.println(isFavorite);
        System.out.println("-----?????????????????????????????------");
    }
}