class JioCinema {
    String movieName;
    String language;
    int duration;
    double rating;
    long views;
    boolean isPremium;

   
JioCinema(String movieName, String language, int duration, double rating,
          long views, boolean isPremium) {
this.movieName = movieName;
this.language = language;
this.duration = duration;
this.rating = rating;
this.views = views;
this.isPremium = isPremium;
    }

    void display() {
        System.out.println(movieName);
        System.out.println(language);
        System.out.println(duration);
        System.out.println(rating);
        System.out.println(views);
        System.out.println(isPremium);
        System.out.println("-------################--------");
    }
}