class TwitterRunner {
    public static void main(String[] args) {

        Twitter t1 = new Twitter("RaviTweets", 120, 50000L, 4.5, true);
        Twitter t2 = new Twitter("AnuPosts", 80, 30000L, 3.2, false);
        Twitter t3 = new Twitter("TechTalk", 200, 90000L, 5.1, true);
        Twitter t4 = new Twitter("FoodieLife", 150, 60000L, 4.0, false);
        Twitter t5 = new Twitter("FitWorld", 170, 70000L, 4.8, true);
        Twitter t6 = new Twitter("MusicZone", 95, 45000L, 3.9, false);
        Twitter t7 = new Twitter("StudyHub", 130, 52000L, 4.3, true);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
        t7.display();
    }
}