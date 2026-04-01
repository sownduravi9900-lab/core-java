class NetflixRunner {
    public static void main(String[] args) {

        Netflix n1 = new Netflix("Stranger Things", "Sci-Fi", 34, 4.8, 2000000L, true);
        Netflix n2 = new Netflix("Money Heist", "Crime", 41, 4.7, 1800000L, true);
        Netflix n3 = new Netflix("Squid Game", "Thriller", 9, 4.6, 2200000L, true);
        Netflix n4 = new Netflix("Wednesday", "Comedy", 8, 4.5, 1500000L, true);
        Netflix n5 = new Netflix("Dark", "Mystery", 26, 4.9, 1300000L, true);
        Netflix n6 = new Netflix("Friends", "Comedy", 236, 4.8, 1700000L, false);
        Netflix n7 = new Netflix("Breaking Bad", "Drama", 62, 4.9, 2100000L, false);

        n1.display();
        n2.display();
        n3.display();
        n4.display();
        n5.display();
        n6.display();
        n7.display();
    }
}