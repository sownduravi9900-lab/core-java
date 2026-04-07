class MagicPin {
    static int checkPizza(String item) {
        int price = 0;
        if ("pani puri"==item) {
            System.out.println("item is: " + item);
            price = 60;
            return price;
        } else if ("bhel puri"== item) {
            System.out.println("item is: " + item);
            price = 70;
            return price;    
        } else if ("sev puri"==item) {
            System.out.println("item is: " + item);
            price = 65;
            return price;
        } else if ("dahi puri"==item) {
            System.out.println("item is: " + item);
            price = 80;
            return price;
        } else if ("ragda chaat"==item) {
            System.out.println("item is: " + item);
            price = 90;
            return price;
        } else if ("samosa"==item) {
            System.out.println("item is: " + item);
            price = 30;
            return price;
        } else if ("kachori" ==item) {
            System.out.println("item is: " + item);
            price = 40;
            return price;
        } else if ("vada pav"==item) {
            System.out.println("item is: " + item);
            price = 35;
            return price;
        } else if ("pav bhaji"==item) {
            System.out.println("item is: " + item);
            price = 120;
            return price;
        } else if ("masala dosa"==item) {
            System.out.println("item is: " + item);
            price = 100;
            return price;
        } else {
            System.out.println("no item found");
            return 0;
        }
    }
    static int calculateBill(String item, int price, int quantity) {
       int total = 0;
       if ("pani puri" == item) {
            total = price * quantity;
            return total;
        } else if ("bhel puri"==item) {
            total = price * quantity;
            return total;
        } else {
            return 0;
        }
    }
}