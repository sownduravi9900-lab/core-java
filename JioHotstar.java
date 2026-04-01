class JioHotstar {
    String showName;
    String language;
    int duration;
    double rating;
    long viewers;
    boolean isLive;
 
    JioHotstar(String showName, String language, int duration, double rating,
               long viewers, boolean isLive, char qualityCode) {
        this.showName = showName;
        this.language = language;
        this.duration = duration;
        this.rating = rating;
        this.viewers = viewers;
        this.isLive = isLive;
    }

    // Display method
    void display() {
        System.out.println(showName);
        System.out.println(language);
        System.out.println(duration);
        System.out.println(rating);
        System.out.println(viewers);
        System.out.println(isLive);
        System.out.println("------/////////////////------");
    }
}