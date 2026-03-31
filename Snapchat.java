class Snapchat {
    String snapUser;
    double snapScore;
    char gender;
    boolean hasStreak;
	
    Snapchat(String snapUser, double snapScore, char gender, boolean hasStreak) {
        this.snapUser = snapUser;
        this.snapScore = snapScore;
        this.gender = gender;
        this.hasStreak = hasStreak;
    }
    void display() {
        System.out.println("Snap User: " + snapUser);
        System.out.println("Snap Score: " + snapScore);
        System.out.println("Gender: " + gender);
        System.out.println("Has Streak: " + hasStreak);
        System.out.println("----------------------");
    }
}