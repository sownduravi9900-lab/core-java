class EatJust {

    static int checkPizza(String item) {

        int price = 0;

        if ("salad"==item) {
            System.out.println("item is: " + item);
            price = 120;
            return price;
        } else if ("wrap"== item) {
            System.out.println("item is: " + item);
            price = 150;
            return price;
            
        } else if ("smoothie"==item) {
            System.out.println("item is: " + item);
            price = 180;
            return price;
        } else if ("juice"==item) {
            System.out.println("item is: " + item);
            price = 100;
            return price;
        } else if ("sandwich"==item) {
            System.out.println("item is: " + item);
            price = 140;
            return price;
        } else if ("protein bowl"==item) {
            System.out.println("item is: " + item);
            price = 220;
            return price;
        } else if ("fruit bowl" ==item) {
            System.out.println("item is: " + item);
            price = 160;
            return price;
        } else if ("granola"==item) {
            System.out.println("item is: " + item);
            price = 130;
            return price;
        } else if ("oats"==item) {
            System.out.println("item is: " + item);
            price = 110;
            return price;
        } else if ("green tea"==item) {
            System.out.println("item is: " + item);
            price = 90;
            return price;
        } else {
            System.out.println("no item found");
            return 0;
		}
    }

    static int calculateBill(String item, int price, int quantity) {

        int total = 0;

        if ("salad" == item) {
            total = price * quantity;
            return total;
        } else if ("wrap"==item) {
            total = price * quantity;
            return total;
        } else {
            return 0;
        }
    }
}


