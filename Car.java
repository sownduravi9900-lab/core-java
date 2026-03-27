class Car {

    static int noWheel = 4;
    static String fuelType = "Petrol";

    public static void main(String[] args) {

        int gear;
        String carName;
        long price;
        String color;
        boolean isAutomatic;
        double mileage;
        int noWheel=6;

        gear = 6;
        carName = "Toyota";
        price = 1200000;
        color = "White";
        isAutomatic = true;
        mileage = 18.5;

        System.out.println("CAR NAME : " + carName);
        System.out.println("GEAR : " + gear);
        System.out.println("PRICE : " + price);
        System.out.println("COLOR : " + color);
        System.out.println("AUTOMATIC : " + isAutomatic);
        System.out.println("MILEAGE : " + mileage);
        System.out.println("FUEL TYPE : " + fuelType);
    }
}