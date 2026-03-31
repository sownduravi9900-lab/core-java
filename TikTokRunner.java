class TikTokRunner {
    public static void main(String[] args) {

        TikTok t1 = new TikTok("RaviCreator", 100000L, 15.5f, 5000, true);
        TikTok t2 = new TikTok("AnuVlogs", 250000L, 30.0f, 12000, true);
        TikTok t3 = new TikTok("TechShorts", 180000L, 45.2f, 8000, false);
        TikTok t4 = new TikTok("FoodReels", 300000L, 25.0f, 15000, true);
        TikTok t5 = new TikTok("FitnessGuru", 220000L, 20.3f, 9000, false);
        TikTok t6 = new TikTok("MusicBeat", 270000L, 35.7f, 11000, true);
        TikTok t7 = new TikTok("StudyTips", 150000L, 40.0f, 7000, false);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
        t7.display();
    }
}