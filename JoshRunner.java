class JoshRunner {
    public static void main(String[] args) {

        Josh j1 = new Josh("Anuska", 50, 1200.75, 'A', true);
        Josh j2 = new Josh("Venktesh", 30, 800.50, 'B', false);
        Josh j3 = new Josh("Supriya", 70, 2000.00, 'A', true);
        Josh j4 = new Josh("Sihi", 20, 500.25, 'C', false);
        Josh j5 = new Josh("Sowndarya", 90, 3000.80, 'A', true);
        Josh j6 = new Josh("Chandini", 40, 950.60, 'B', false);
        Josh j7 = new Josh("Anantha", 60, 1750.40, 'C', true);

        j1.display();
        j2.display();
        j3.display();
        j4.display();
        j5.display();
        j6.display();
        j7.display();
    }
}