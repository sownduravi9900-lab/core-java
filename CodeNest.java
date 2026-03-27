class CodeNest {

    // 3 static variables
    static String platformName = "CodeNest";
    static String language = "Java";
    static int maxUsers = 500;

    public static void main(String[] args) {

        // 3 local variables
        String courseName;
        double courseFee;
        boolean isActive;

        courseName = "Core Java";
        courseFee = 2999.00;
        isActive = true;

        System.out.println("Platform Name : " + platformName);
        System.out.println("Language      : " + language);
        System.out.println("Max Users     : " + maxUsers);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Course Fee    : " + courseFee);
        System.out.println("Active        : " + isActive);
    }
}