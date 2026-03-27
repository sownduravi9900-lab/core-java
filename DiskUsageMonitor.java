class DiskUsageMonitor {

    public static void main(String[] args) {

        System.out.println("Hello Disk Usage Monitor");

        getDiskInfo();

        System.out.println("I have two disk usage values, please add and display");

        long driveC = 250000L;
        long driveD = 175000L;
        boolean diskHealthy = true;

        calculateUsage(driveC, driveD, diskHealthy); // calling method

        System.out.println("What is the available disk space");

        double freeSpace = getFreeSpace();
        System.out.println(freeSpace);
    }

    // no return type & no parameter
    static void getDiskInfo() {
        System.out.println("Disk monitor checks storage usage and system health");
    }

    // no return type & parameters
    static void calculateUsage(long d1, long d2, boolean health) {
        System.out.println("Calculating total disk usage");
        long totalUsage = d1 + d2;
        System.out.println(totalUsage);
        System.out.println("Disk Health Status: " + health);
    }

    // return type & no parameter
    static double getFreeSpace() {
        System.out.println("Checking available disk space");
        double space = 512.75;
        System.out.println("Disk space retrieved successfully");
        return space;
    }
}