class WhatsAppRunner {
    public static void main(String[] args) {

        WhatsApp w1 = new WhatsApp("Ravi", "9876543210", 120, 50, 1.5, true, 'A');
        WhatsApp w2 = new WhatsApp("YAshwanth", "9123456780", 80, 40, 3.2, false, 'B');
        WhatsApp w3 = new WhatsApp("Kamli", "9988776655", 200, 60, 0.5, true, 'A');
        WhatsApp w4 = new WhatsApp("Ningi", "9090909090", 60, 35, 5.0, false, 'C');
        WhatsApp w5 = new WhatsApp("Borakka", "9345678901", 150, 55, 2.3, true, 'A');
        WhatsApp w6 = new WhatsApp("Siddamma", "9765432109", 90, 45, 4.7, false, 'B');
        WhatsApp w7 = new WhatsApp("Nagamma", "9001122334", 170, 65, 1.0, true, 'A');

        w1.display();
        w2.display();
        w3.display();
        w4.display();
        w5.display();
        w6.display();
        w7.display();
    }
}