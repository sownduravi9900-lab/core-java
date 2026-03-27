class BatteryRunner {

    public static void main(String[] args) {

        System.out.println("Running Battery Class");

        Battery.checkBatteryConnection();
        Battery.connectBattery();
        Battery.checkBatteryConnection();

        int currentCharge = Battery.getCurrentCharge();
        System.out.println("Current Charge is : " + currentCharge);

        System.out.println("Increasing " + Battery.incCharge());
        System.out.println("Increasing " + Battery.incCharge());
        System.out.println("Increasing " + Battery.incCharge());
        System.out.println("Increasing " + Battery.incCharge());
        System.out.println("Increasing " + Battery.incCharge());

        System.out.println("Decreasing " + Battery.decCharge());
        System.out.println("Decreasing " + Battery.decCharge());
        System.out.println("Decreasing " + Battery.decCharge());
        System.out.println("Decreasing " + Battery.decCharge());
        System.out.println("Decreasing " + Battery.decCharge());
    }
}