class GitHubRunner {
    public static void main(String[] args) {

        GitHub g1 = new GitHub("ProjectAI", "Ravi", 150, 1.1, false);
        GitHub g2 = new GitHub("WebApp", "Anu", 230, 2.0, true);
        GitHub g3 = new GitHub("DataTool", "Kiran", 320, 1.5, false);
        GitHub g4 = new GitHub("MobileApp", "Sneha", 180, 3.2, true);
        GitHub g5 = new GitHub("GameEngine", "Arjun", 500, 4.0, false);
        GitHub g6 = new GitHub("CloudSys", "Meena", 275, 2.5, true);
        GitHub g7 = new GitHub("SecurityApp", "Rahul", 410, 3.8, false);

        g1.display();
        g2.display();
        g3.display();
        g4.display();
        g5.display();
        g6.display();
        g7.display();
    }
}