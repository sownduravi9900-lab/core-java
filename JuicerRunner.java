class JuicerRunner {

    public static void main(String[] args) {

        Juicer.brand();

        Juicer.setSpeed(2);

        int juicerPrice = Juicer.price();
        System.out.println("Price: " + juicerPrice);

        String juicerColor = Juicer.color("White");
        System.out.println("Color: " + juicerColor);

    }

}