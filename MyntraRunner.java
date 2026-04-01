class MyntraRunner {
    public static void main(String[] args) {

        Myntra m1 = new Myntra("Sowndaryashu", "Nike", 10, 999.99, 4.5f, true, 'M');
        Myntra m2 = new Myntra("Bhagya", "Levis", 8, 1999.50, 4.3f, true, 'L');
        Myntra m3 = new Myntra("Srinivas", "Adidas", 5, 2999.00, 4.6f, true, 'S');
        Myntra m4 = new Myntra("Aishwarya", "Puma", 6, 2499.75, 4.4f, false, 'M');
        Myntra m5 = new Myntra("Druthi", "Zara", 7, 1599.60, 4.2f, true, 'S');
        Myntra m6 = new Myntra("Nakul", "HRX", 12, 499.40, 3.9f, true, 'L');
        Myntra m7 = new Myntra("Gunda", "Roadster", 9, 799.20, 4.1f, true, 'M');

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
        m6.display();
        m7.display();
    }
}