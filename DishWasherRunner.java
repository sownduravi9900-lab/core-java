class DishWasherRunner {

    public static void main(String[] args) {

        DishWasher.brand();

        DishWasher.setMode(3);

        int dishWasherPrice = DishWasher.price();
        System.out.println("Price: " + dishWasherPrice);

        String dishWasherColor = DishWasher.color("Silver");
        System.out.println("Color: " + dishWasherColor);

    }

}