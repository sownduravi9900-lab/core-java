class ElectricTimerRunner {

    public static void main(String[] args) {

        System.out.println("Running ElectricTimer Class");

        // check timer is ON or OFF
        ElectricTimer.checkTimerIsOnOrOff();
        ElectricTimer.turnOnTimer();
        ElectricTimer.checkTimerIsOnOrOff();

        int currentTime = ElectricTimer.getCurrentTime();
        System.out.println("Current Time is : " + currentTime);

        // increase time
        System.out.println("Increasing " + ElectricTimer.incTime());
        System.out.println("Increasing " + ElectricTimer.incTime());
        System.out.println("Increasing " + ElectricTimer.incTime());
        System.out.println("Increasing " + ElectricTimer.incTime());
        System.out.println("Increasing " + ElectricTimer.incTime());

        // decrease time
        System.out.println("Decreasing " + ElectricTimer.decTime());
        System.out.println("Decreasing " + ElectricTimer.decTime());
        System.out.println("Decreasing " + ElectricTimer.decTime());
        System.out.println("Decreasing " + ElectricTimer.decTime());
        System.out.println("Decreasing " + ElectricTimer.decTime());
}
}