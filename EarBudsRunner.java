class EarBudsRunner {

    public static void main(String[] args) {

        System.out.println("Running EarBuds Class");

        EarBuds.checkEarBudsConnection();
        EarBuds.connectEarBuds();
        EarBuds.checkEarBudsConnection();

        
        int currentVolume = EarBuds.getCurrentVolume();
        System.out.println("Current Volume is : " + currentVolume);

        System.out.println("Increasing " + EarBuds.incVolume());
        System.out.println("Increasing " + EarBuds.incVolume());
        System.out.println("Increasing " + EarBuds.incVolume());
        System.out.println("Increasing " + EarBuds.incVolume());
        System.out.println("Increasing " + EarBuds.incVolume());

        System.out.println("Decreasing " + EarBuds.decVolume());
        System.out.println("Decreasing " + EarBuds.decVolume());
        System.out.println("Decreasing " + EarBuds.decVolume());
        System.out.println("Decreasing " + EarBuds.decVolume());
        System.out.println("Decreasing " + EarBuds.decVolume());
    }
}