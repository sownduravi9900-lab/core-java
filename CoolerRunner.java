class CoolerRunner {

    public static void main(String[] args) {

        System.out.println("Running Cooler Class");

        Cooler.checkCoolerIsOnOrOff();
        Cooler.turnOnCooler();
        Cooler.checkCoolerIsOnOrOff();

        int currentSpeed = Cooler.getCurrentSpeed();
        System.out.println("Current Speed is : " + currentSpeed);

        System.out.println("Increasing " + Cooler.incSpeed());
        System.out.println("Increasing " + Cooler.incSpeed());
        System.out.println("Increasing " + Cooler.incSpeed());
        System.out.println("Increasing " + Cooler.incSpeed());
        System.out.println("Increasing " + Cooler.incSpeed());

        System.out.println("Decreasing " + Cooler.decSpeed());
        System.out.println("Decreasing " + Cooler.decSpeed());
        System.out.println("Decreasing " + Cooler.decSpeed());
        System.out.println("Decreasing " + Cooler.decSpeed());
        System.out.println("Decreasing " + Cooler.decSpeed());
    }
}