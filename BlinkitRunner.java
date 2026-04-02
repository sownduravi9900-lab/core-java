class BlinkitRunner {

    public static void main(String[] args) {

        System.out.println("Place your order on Blinkit");

        Blinkit order1 = new Blinkit("Sowndarya","Groceries","Milk",120.50);

        System.out.println("Track your order");

        Blinkit track = new Blinkit("Sowndarya", "Milk");
		
        Blinkit SowndaryaProfile = new Blinkit("Sowndarya");
    }
}