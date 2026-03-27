class HeaterRunner {

    public static void main(String[] args) {

        System.out.println("Running Heater Class");

        Heater.checkHeaterIsOnOrOff();
        Heater.turnOnHeater();
        Heater.checkHeaterIsOnOrOff();

        int currentTemperature = Heater.getCurrentTemperature();
        System.out.println("Current Temperature is : " + currentTemperature);

        System.out.println("Increasing " + Heater.incTemperature());
        System.out.println("Increasing " + Heater.incTemperature());
        System.out.println("Increasing " + Heater.incTemperature());
        System.out.println("Increasing " + Heater.incTemperature());
        System.out.println("Increasing " + Heater.incTemperature());

        System.out.println("Decreasing " + Heater.decTemperature());
        System.out.println("Decreasing " + Heater.decTemperature());
        System.out.println("Decreasing " + Heater.decTemperature());
        System.out.println("Decreasing " + Heater.decTemperature());
        System.out.println("Decreasing " + Heater.decTemperature());
    }
}