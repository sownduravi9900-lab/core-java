class StudentPortal {

    // 3 static variables
    static String portalName = "CampusConnect";
    static String collegeName = "ABC College";
    static int totalStudents = 2500;

    public static void main(String[] args) {

        // 3 local variables
        String studentName;
        int rollNumber;
        boolean isLoggedIn;

        studentName = "Ravi";
        rollNumber = 101;
        isLoggedIn = true;

        System.out.println("Portal Name   : " + portalName);
        System.out.println("College Name  : " + collegeName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Student Name  : " + studentName);
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Logged In     : " + isLoggedIn);
    }
}