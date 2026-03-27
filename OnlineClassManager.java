class OnlineClassManager {

    public static void main(String[] args) {

        System.out.println("Welcome to Online Class Manager");

        getClassInfo();

        System.out.println("I have two class durations, please add and display");

        byte morningClass = 2;   
        byte eveningClass = 3;   
        boolean classLive = true;

        addClassDuration(morningClass, eveningClass, classLive); // calling method

        System.out.println("What is the monthly subscription fee");

        double subscriptionFee = getSubscriptionFee();
        System.out.println(subscriptionFee);
    }

    
    static void getClassInfo() {
        System.out.println("Live and recorded online classes available");
    }

    static void addClassDuration(byte mClass, byte eClass, boolean live) {
        System.out.println("Calculating total class duration");
        int totalHours = mClass + eClass;
        System.out.println(totalHours + " hours");
        System.out.println("Class Live Status: " + live);
    }

    // return type & no parameter (different return data type)
    static double getSubscriptionFee() {
        System.out.println("Please wait, fetching subscription fee");
        double fee = 1999.00;
        System.out.println("Subscription fee fetched successfully");
        return fee;
    }
}