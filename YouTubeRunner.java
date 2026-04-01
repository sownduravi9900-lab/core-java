class YouTubeRunner {
    public static void main(String[] args) {

        YouTube y1 = new YouTube("SamSameer Insta", "Java Tutorial", 50000, 1000000L, 15.5, true, 'H');
        YouTube y2 = new YouTube("FoodyBrahmin", "Street Food", 30000, 500000L, 10.2, false, 'M');
        YouTube y3 = new YouTube("TravelVlogs", "Goa Trip", 80000, 750000L, 20.0, true, 'H');
        YouTube y4 = new YouTube("FitnessPro", "Workout Tips", 45000, 600000L, 12.5, true, 'M');
        YouTube y5 = new YouTube("MusicBeat", "New Song", 90000, 850000L, 4.5, false, 'H');
        YouTube y6 = new YouTube("StudyHub", "Exam Tips", 25000, 400000L, 18.0, true, 'L');
        YouTube y7 = new YouTube("GamingZone", "PUBG Match", 70000, 950000L, 25.0, true, 'H');

        y1.display();
        y2.display();
        y3.display();
        y4.display();
        y5.display();
        y6.display();
        y7.display();
    }
}