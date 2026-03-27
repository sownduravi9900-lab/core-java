class ElectricTimer {

    static boolean isTimerRunning = false;
    static int maxTime = 120;
    static int minTime = 0;
    static int currentTime;

    static void checkTimerStatus() {
        if(isTimerRunning == false){
            System.out.println("Checking : Timer is OFF");
        } else {
            System.out.println("Checking : Timer is ON");
        }
    }

    static void startTimer() {
        System.out.println("Starting the Electric Timer");
        isTimerRunning = true;
    }

    static int getCurrentTime() {
        return currentTime;
    }

}