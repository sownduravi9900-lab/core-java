class MangoRunner {
    public static void main(String[] args) {

        Mango m1 = new Mango("Thothapuri", 500, 10, "Large");
        Mango m2 = new Mango("Kesar", 300, 8, "Medium");
        Mango m3 = new Mango("Banganapalli", 250, 12, "Small");

        m1.display();
        m2.display();
        m3.display();
    }
}