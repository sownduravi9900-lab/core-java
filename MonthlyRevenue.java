public class MonthlyRevenue {
    public static void main(String[] args) {

        // declaration and initialization
        int monthNumber = 1;
        double revenueAmount = 125000.50;
        String monthName = "January";
        boolean targetAchieved = true;
        char performanceGrade = 'A';

        // printing initial values
        System.out.println("Initial Monthly Revenue:");
        System.out.println("Month Number: " + monthNumber);
        System.out.println("Revenue Amount: " + revenueAmount);
        System.out.println("Month Name: " + monthName);
        System.out.println("Target Achieved: " + targetAchieved);
        System.out.println("Performance Grade: " + performanceGrade);

        // reassigning values
        monthNumber = 2;
        revenueAmount = 118500.75;
        monthName = "February";
        targetAchieved = false;
        performanceGrade = 'B';

        System.out.println("\nUpdated Monthly Revenue:");
        System.out.println("Month Number: " + monthNumber);
        System.out.println("Revenue Amount: " + revenueAmount);
        System.out.println("Month Name: " + monthName);
        System.out.println("Target Achieved: " + targetAchieved);
        System.out.println("Performance Grade: " + performanceGrade);
    }
}