class AirPurifierRunner {

    public static void main(String[] args) {

        System.out.println("Running AirPurifier Class");

        AirPurifier.checkAirPurifierIsOnOrOff();
        AirPurifier.turnOnAirPurifier();
        AirPurifier.checkAirPurifierIsOnOrOff();

        int currentLevel = AirPurifier.getCurrentLevel();
        System.out.println("Current Level is : " + currentLevel);

        System.out.println("Increasing " + AirPurifier.incLevel());
        System.out.println("Increasing " + AirPurifier.incLevel());
        System.out.println("Increasing " + AirPurifier.incLevel());
        System.out.println("Increasing " + AirPurifier.incLevel());
        System.out.println("Increasing " + AirPurifier.incLevel());

        System.out.println("Decreasing " + AirPurifier.decLevel());
        System.out.println("Decreasing " + AirPurifier.decLevel());
        System.out.println("Decreasing " + AirPurifier.decLevel());
        System.out.println("Decreasing " + AirPurifier.decLevel());
        System.out.println("Decreasing " + AirPurifier.decLevel());
    }
}