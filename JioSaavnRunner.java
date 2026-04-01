class JioSaavnRunner {
    public static void main(String[] args) {

        JioSaavn j1 = new JioSaavn("Motu","Arijit Singh", "Hindi", 230, 4.5, 2000000L, true);
        JioSaavn j2 = new JioSaavn("Pathlu", "Anirudh", "Tamil", 215, 4.4, 1800000L, false);
        JioSaavn j3 = new JioSaavn("Chingam", "Arijit Singh", "Hindi", 260, 4.9, 2500000L, true);
        JioSaavn j4 = new JioSaavn("Dr.Jhatka", "Armaan Malik", "Telugu", 210, 4.6, 2200000L, true);
        JioSaavn j5 = new JioSaavn("JohnTheDon", "Anirudh", "Tamil", 190, 4.3, 1700000L, false);
        JioSaavn j6 = new JioSaavn("Hawaldar", "Sid Sriram", "Telugu", 240, 4.7, 2100000L, true);
        JioSaavn j7 = new JioSaavn("Ghasitharam", "Imagine Dragons", "English", 200, 4.8, 2300000L, false);

        j1.display();
        j2.display();
        j3.display();
        j4.display();
        j5.display();
        j6.display();
        j7.display();
    }
}