class DoorBash {

    static int checkPizza(String item) {

        int price = 0;

        if ("burger"==item) {
            System.out.println("item is: " + item);
            price = 150;
            return price;
        } else if ("pizza"== item) {
            System.out.println("item is: " + item);
            price = 300;
            return price;
            
        } else if ("pasta"==item) {
            System.out.println("item is: " + item);
            price = 250;
            return price;
        } else if ("sandwich"==item) {
            System.out.println("item is: " + item);
            price = 120;
            return price;
        } else if ("french fries"==item) {
            System.out.println("item is: " + item);
            price = 100;
            return price;
        } else if ("fried chicken"==item) {
            System.out.println("item is: " + item);
            price = 280;
            return price;
        } else if ("noodles" ==item) {
            System.out.println("item is: " + item);
            price = 180;
            return price;
        } else if ("momos"==item) {
            System.out.println("item is: " + item);
            price = 130;
            return price;
        } else if ("shawarma"==item) {
            System.out.println("item is: " + item);
            price = 200;
            return price;
        } else if ("biryani"==item) {
            System.out.println("item is: " + item);
            price = 250;
            return price;
        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int calculateBill(String item, int price, int quantity) {

        int total = 0;

        if ("burger" == item) {
            total = price * quantity;
            return total;
        } else if ("pizza"==item) {
            total = price * quantity;
            return total;
        } else {
            return 0;
        }
    }
}