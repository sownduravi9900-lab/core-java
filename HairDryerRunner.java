class HairDryerRunner {

    public static void main(String[] args) {

        HairDryer.brand();

        HairDryer.setSpeed(3);

        int hairDryerPrice = HairDryer.price();
        System.out.println("Price: " + hairDryerPrice);

        String hairDryerColor = HairDryer.color("Pink");
        System.out.println("Color: " + hairDryerColor);

    }

}