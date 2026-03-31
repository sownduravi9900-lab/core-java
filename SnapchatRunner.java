class SnapchatRunner {
    public static void main(String[] args) {

        Snapchat s1 = new Snapchat("Ravi_snap", 1234.5, 'M', true);
        Snapchat s2 = new Snapchat("Anu_snap", 2345.8, 'F', true);
        Snapchat s3 = new Snapchat("Tech_guy", 3456.2, 'M', false);
        Snapchat s4 = new Snapchat("Food_snap", 1890.7, 'F', true);
        Snapchat s5 = new Snapchat("Fit_snap", 2765.4, 'M', false);
        Snapchat s6 = new Snapchat("Music_snap", 3100.9, 'F', true);
        Snapchat s7 = new Snapchat("Study_snap", 1500.3, 'M', false);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
    }
}