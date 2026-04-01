class JioCinemaRunner {
    public static void main(String[] args) {

        JioCinema j1 = new JioCinema("GandadaGudi", "Kannada", 180, 4.8, 1000000L, true);
        JioCinema j2 = new JioCinema("Diggajaru", "Kannada", 170, 4.7, 900000L, true);
        JioCinema j3 = new JioCinema("SimhadriyaSimha", "Kannada", 160, 4.5, 850000L, false);
        JioCinema j4 = new JioCinema("SuryaVamsha", "Kannada", 140, 4.6, 700000L, false);
        JioCinema j5 = new JioCinema("ThavarigeBaaThangi", "Kannada", 175, 4.9, 1200000L, true);
        JioCinema j6 = new JioCinema("SuviSuvali", "Kannada", 150, 4.4, 650000L, false);
        JioCinema j7 = new JioCinema("GanadaBerunda", "Kannada", 165, 4.3, 600000L, true);

        j1.display();
        j2.display();
        j3.display();
        j4.display();
        j5.display();
        j6.display();
    }
}