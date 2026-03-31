class Mango {
    String type;
    int price;
    int quantity;
    String size;

    
    Mango(String p1, int p2, int p3, String p4) {
        this.type = p1;
        this.price = p2;
        this.quantity = p3;
        this.size = p4;
    }

    void display() {
        System.out.println( type);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(size);
        System.out.println("----------------------");
    }
}