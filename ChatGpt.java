class ChatGpt {
    String userName;
    int questionsAsked;
    double usageHours;
    char planType;
    boolean isSubscribed;

   
    ChatGpt(String userName, int questionsAsked, double usageHours, char planType, boolean isSubscribed) {
        userName = userName;
        questionsAsked = questionsAsked;
        usageHours = usageHours;
        planType = planType;
        isSubscribed = isSubscribed;
    }
    void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Questions Asked: " + questionsAsked);
        System.out.println("Usage Hours: " + usageHours);
        System.out.println("Plan Type: " + planType);
        System.out.println("Subscribed: " + isSubscribed);
        System.out.println("----------------------");
    }
}