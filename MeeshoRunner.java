class MeeshoRunner {
    public static void main(String[] args) {

        Meesho m1 = new Meesho("RaviStore", 120, 50000.50, 'A', true);
        Meesho m2 = new Meesho("AnuFashion", 80, 30000.75, 'B', false);
        Meesho m3 = new Meesho("KiranMart", 200, 90000.00, 'A', true);
        Meesho m4 = new Meesho("SnehaShop", 150, 60000.20, 'C', false);
        Meesho m5 = new Meesho("ArjunDeals", 170, 70000.90, 'A', true);
        Meesho m6 = new Meesho("MeenaCollections", 95, 45000.60, 'B', false);
        Meesho m7 = new Meesho("RahulStore", 130, 52000.40, 'A', true);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
        m6.display();
        m7.display();
    }
}