class BazaarNow {

    static int checkPizza(String item) {

        int price = 0;

        if ("margherita"==item) {
            System.out.println("item is: " + item);
            price = 200;
            return price;
        } else if ("farmhouse"== item) {
            System.out.println("item is: " + item);
            price = 350;
            return price;
            
        } else if ("peppy paneer"==item) {
            System.out.println("item is: " + item);
            price = 400;
            return price;
        } else if ("veggie deluxe"==item) {
            System.out.println("item is: " + item);
            price = 450;
            return price;
        } else if ("cheese burst"==item) {
            System.out.println("item is: " + item);
            price = 500;
            return price;
        } else if ("chicken dominator"==item) {
            System.out.println("item is: " + item);
            price = 600;
            return price;
        } else if ("pepper bbq chicken" ==item) {
            System.out.println("item is: " + item);
            price = 550;
            return price;
        } else if ("paneer makhani"==item) {
            System.out.println("item is: " + item);
            price = 480;
            return price;
        } else if ("mexican green wave"==item) {
            System.out.println("item is: " + item);
            price = 420;
            return price;
        } else if ("indian tandoori"==item) {
            System.out.println("item is: " + item);
            price = 530;
            return price;
        } else if ("veg extravaganza"==item) {
            System.out.println("item is: " + item);
            price = 470;
            return price;
        } else if ("double cheese"==item) {
            System.out.println("item is: " + item);
            price = 390;
            return price;
        } else if ("chicken sausage"==item) {
            System.out.println("item is: " + item);
            price = 410;
            return price;
        } else if ("spicy chicken"==item) {
            System.out.println("item is: " + item);
            price = 520;
            return price;
        } else if ("corn cheese"==item) {
            System.out.println("item is: " + item);
            price = 300;
            return price;
        } else {
            System.out.println("no item found");
            return 0;
        }
    }

    static int calculateBill(String item, int price, int quantity) {

        int total = 0;

        if ("Mixtures" == item) {
            total = price * quantity;
            return total;
        } else if ("farmhouse"==item) {
            total = price * quantity;
            return total;
        } else {
            return 0;
        }
    }
}


