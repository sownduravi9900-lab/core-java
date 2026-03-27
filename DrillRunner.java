class DrillRunner {

    public static void main(String[] args) {

        System.out.println("Running Drill Class");

        Drill.checkDrillIsOnOrOff();
        Drill.turnOnDrill();
        Drill.checkDrillIsOnOrOff();

        int currentSpeed = Drill.getCurrentSpeed();
        System.out.println("Current Speed is : " + currentSpeed);

        System.out.println("Increasing " + Drill.incSpeed());
        System.out.println("Increasing " + Drill.incSpeed());
        System.out.println("Increasing " + Drill.incSpeed());
        System.out.println("Increasing " + Drill.incSpeed());
        System.out.println("Increasing " + Drill.incSpeed());

        System.out.println("Decreasing " + Drill.decSpeed());
        System.out.println("Decreasing " + Drill.decSpeed());
        System.out.println("Decreasing " + Drill.decSpeed());
        System.out.println("Decreasing " + Drill.decSpeed());
        System.out.println("Decreasing " + Drill.decSpeed());
    }
}