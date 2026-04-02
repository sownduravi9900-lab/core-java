class SwiggyRunner {

    public static void main(String[] args) {

        System.out.println("Place your order on Swiggy");

        Swiggy order1 = new Swiggy("Sowndarya","Dominos","Pizza",299.99);

        System.out.println("Track your order");

        Swiggy track = new Swiggy("Sowndarya", "Pizza");
		
		Swiggy SowndaryaProfile = new Swiggy("Sowndarya");
    }
}