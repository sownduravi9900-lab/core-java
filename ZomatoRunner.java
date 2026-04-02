class ZomatoRunner {

    public static void main(String[] args) {

        System.out.println("Place your order on Zomato");

        Zomato order1 = new Zomato("Sowndarya","Dominos","Pizza",299.99);

        System.out.println("Track your order");

        Zomato track = new Zomato("Sowndarya", "Pizza");
		
        Zomato SowndaryaProfile = new Zomato("Sowndarya");
    }
}