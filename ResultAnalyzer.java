public class ResultAnalyzer {
    public static void main(String[] args) {

      
        int studentId = 1101;
        double percentage = 78.65;
        String studentName = "Kiran";
        boolean isPassed = true;
        char grade = 'B';

      
        System.out.println("Initial Result Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Percentage: " + percentage);
        System.out.println("Student Name: " + studentName);
        System.out.println("Passed: " + isPassed);
        System.out.println("Grade: " + grade);

        studentId = 1102;
        percentage = 84.20;
        studentName = "Sowndu";
        isPassed = true;
        grade = 'A';

        System.out.println("\nUpdated Result Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Percentage: " + percentage);
        System.out.println("Student Name: " + studentName);
        System.out.println("Passed: " + isPassed);
        System.out.println("Grade: " + grade);
    }
}