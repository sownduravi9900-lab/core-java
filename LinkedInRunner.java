class LinkedInRunner {
    public static void main(String[] args) {

        LinkedIn l1 = new LinkedIn("Ravi", "Software Engineer", "TCS", 500, 120, 1500.5, true);
        LinkedIn l2 = new LinkedIn("Sowndarya", "Data Analyst", "Infosys", 350, 90, 1200.0, false);
        LinkedIn l3 = new LinkedIn("Yashwanth", "Web Developer", "Wipro", 420, 110, 1350.8, true);
        LinkedIn l4 = new LinkedIn("Shravanthi", "HR Manager", "Accenture", 300, 70, 980.6, false);
        LinkedIn l5 = new LinkedIn("Komali", "DevOps Engineer", "IBM", 550, 140, 1600.2, true);
        LinkedIn l6 = new LinkedIn("Amith", "UI Designer", "Capgemini", 280, 65, 900.4, false);
        LinkedIn l7 = new LinkedIn("Rahul", "Tester", "HCL", 390, 100, 1250.7, true);

        l1.display();
        l2.display();
        l3.display();
        l4.display();
        l5.display();
        l6.display();
        l7.display();
    }
}