class AjioRunner {
    public static void main(String[] args) {

        Ajio a1 = new Ajio("Kurta", "Ethnic", 10, 999.99, 20.5f, true, 'M');
        Ajio a2 = new Ajio("Shirt", "Casual", 8, 799.50, 15.0f, false, 'L');
        Ajio a3 = new Ajio("Jeans", "Denim", 6, 1499.00, 25.0f, true, 'S');
        Ajio a4 = new Ajio("Jacket", "Winter", 5, 2499.75, 30.0f, false, 'M');
        Ajio a5 = new Ajio("Dress", "Western", 7, 1299.60, 18.0f, true, 'S');
        Ajio a6 = new Ajio("Top", "Fashion", 12, 599.40, 10.0f, false, 'L');
        Ajio a7 = new Ajio("Shorts", "Summer", 9, 699.20, 22.5f, true, 'M');

        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();
        a6.display();
        a7.display();
    }
}