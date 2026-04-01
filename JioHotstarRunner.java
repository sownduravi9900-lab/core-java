class JioHotstarRunner {
    public static void main(String[] args) {

        JioHotstar j1 = new JioHotstar("IPL Match", "Hindi", 240, 4.9, 3000000L, true);
        JioHotstar j2 = new JioHotstar("Cricket Highlights", "English", 60, 4.7, 2000000L, false);
        JioHotstar j3 = new JioHotstar("Movie Night", "Tamil", 150, 4.5, 1500000L, false);
        JioHotstar j4 = new JioHotstar("Football Live", "English", 120, 4.6, 1800000L, true);
        JioHotstar j5 = new JioHotstar("Kids Show", "Hindi", 90, 4.3, 1200000L, false);
        JioHotstar j6 = new JioHotstar("News Live", "Hindi", 180, 4.4, 1600000L, true);
        JioHotstar j7 = new JioHotstar("Web Series", "English", 200, 4.8, 2200000L, false);

        j1.display();
        j2.display();
        j3.display();
        j4.display();
        j5.display();
        j6.display();
        j7.display();
    }
}