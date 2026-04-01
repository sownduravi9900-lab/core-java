class WikipediaRunner {
    public static void main(String[] args) {

        Wikipedia w1 = new Wikipedia("Java Programming", "English", 5000, 4.5, true, 'A', 100000L);
        Wikipedia w2 = new Wikipedia("AI", "English", 7000, 4.7, true, 'A', 150000L);
        Wikipedia w3 = new Wikipedia("India History", "Hindi", 6000, 4.3, false, 'B', 90000L);
        Wikipedia w4 = new Wikipedia("Space Science", "English", 5500, 4.6, true, 'A', 120000L);
        Wikipedia w5 = new Wikipedia("WWII", "English", 8000, 4.8, true, 'A', 200000L);
        Wikipedia w6 = new Wikipedia("Networks", "English", 4500, 4.2, false, 'C', 85000L);
        Wikipedia w7 = new Wikipedia("Data Structures", "English", 5200, 4.4, true, 'A', 110000L);

        w1.display();
        w2.display();
        w3.display();
        w4.display();
        w5.display();
        w6.display();
        w7.display();
    }
}