class FacebookRunner {
    public static void main(String[] args) {

        Facebook f1 = new Facebook("Ravi123", 1500, 120, true);
        Facebook f2 = new Facebook("Sowndu", 2300, 95, false);
        Facebook f3 = new Facebook("Yashwanth", 5400, 210, true);
        Facebook f4 = new Facebook("Raveesha", 3200, 180, false);
        Facebook f5 = new Facebook("Anuska", 4100, 160, true);
        Facebook f6 = new Facebook("Kushal", 2700, 140, false);
        Facebook f7 = new Facebook("Priya", 1900, 110, false);

        f1.display();
        f2.display();
        f3.display();
        f4.display();
        f5.display();
        f6.display();
        f7.display();
    }
}