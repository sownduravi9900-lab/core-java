class EatSure {

    static int checkPizza(String item) {

        int price = 0;

        if ("idli"==item) {
            System.out.println("item is: " + item);
            price = 50;
            return price;
        } else if ("dosa"== item) {
            System.out.println("item is: " + item);
            price = 80;
            return price;
            
        } else if ("vada"==item) {
            System.out.println("item is: " + item);
            price = 40;
            return price;
        } else if ("pongal"==item) {
            System.out.println("item is: " + item);
            price = 90;
            return price;
        } else if ("upma"==item) {
            System.out.println("item is: " + item);
            price = 70;
            return price;
        } else if ("poori"==item) {
            System.out.println("item is: " + item);
            price = 100;
            return price;
        } else if ("chapati" ==item) {
            System.out.println("item is: " + item);
            price = 60;
            return price;
        } else if ("meals"==item) {
            System.out.println("item is: " + item);
            price = 150;
            return price;
        } else if ("biryani"==item) {
            System.out.println("item is: " + item);
            price = 180;
            return price;
        } else if ("curd rice"==item) {
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

        if ("idli" == item) {
            total = price * quantity;
            return total;
        } else if ("dosa"==item) {
            total = price * quantity;
            return total;
        } else {
            return 0;
        }
    }
}


