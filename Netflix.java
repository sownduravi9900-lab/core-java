class Netflix {
    String showName;
    int episodes;
    double rating;
    long views;
    boolean isOriginal;
    char ageRating;

    Netflix(String showName, int episodes, double rating,
            long views, boolean isOriginal, char ageRating) {
        this.showName = showName;
        this.episodes = episodes;
        this.rating = rating;
        this.views = views;
        this.isOriginal = isOriginal;
        this.ageRating = ageRating;
    }
    void display() {
        System.out.println(showName);
        System.out.println(episodes);
        System.out.println(rating);
        System.out.println(views);
        System.out.println(isOriginal);
        System.out.println(ageRating);
        System.out.println("------...............-------");
    }
}