class WhatsApp {

    // Static variables 
    static int appVersion = 240;
    static String developer = "Meta";
    static boolean darkMode = true;
    static long totalUsers = 2000000000L; 
    static char platform = 'All'; 

    public static void main(String[] args) {

        // Local variables 
        int messagesSent = 150;
        String sender = "Sowndu";
        float dataUsed = 12.5f; 
        boolean isOnline = true;
        char status = 'Active'; 

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("messagesSent : " + messagesSent);
        System.out.println("sender : " + sender);
        System.out.println("dataUsed : " + dataUsed);
        System.out.println("isOnline : " + isOnline);
        System.out.println("status : " + status);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("appVersion : " + appVersion);
        System.out.println("developer : " + developer);
        System.out.println("darkMode : " + darkMode);
        System.out.println("totalUsers : " + totalUsers);
        System.out.println("platform : " + platform);
    }
}