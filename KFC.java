class KFC {

    static int checkPizza(String item) {

        int price = 0;

        if ("chicken bucket"==item) {
            System.out.println("item is: " + item);
            price = 500;
            return price;
        } else if ("zinger burger"== item) {
            System.out.println("item is: " + item);
            price = 250;
            return price;
            
        } else if ("chicken popcorn"==item) {
            System.out.println("item is: " + item);
            price = 200;
            return price;
        } else if ("hot wings"==item) {
            System.out.println("item is: " + item);
            price = 300;
            return price;
        } else if ("veg burger".==item) {
            System.out.println("item is: " + item);
            price = 180;
            return price;
        } else if ("chicken strips"==item) {
            System.out.println("item is: " + item);
            price = 350;
            return price;
        } else if ("peri peri fries" ==item) {
            System.out.println("item is: " + item);
            price = 150;
            return price;
        } else if ("krushers".==item) {
            System.out.println("item is: " + item);
            price = 120;
            return price;
        } else if ("rice bowl".==item) {
            System.out.println("item is: " + item);
            price = 220;
            return price;
        } else if ("chicken roll"==item) {
            System.out.println("item is: " + item);
            price = 260;
            return price;
        } else {
            System.out.println("no item found");
            return 0;
        }

        return price;
    }

    static int calculateBill(String item, int price, int quantity) {

        int total = 0;

        if ("chicken bucket" == item) {
            total = price * quantity;
            return total;
        } else if ("zinger burger"==item) {
            total = price * quantity;
            return total;
        } else {
            return 0;
        }
    }
}