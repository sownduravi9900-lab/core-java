class HairBandsRunner {
    public static void main(String[] args) {

        HairBands h1 = new HairBands("Cotton", "Plain", 5, true);
        HairBands h2 = new HairBands("Silk", "Printed", 7, true);
        HairBands h3 = new HairBands("Plastic", "Decorative", 3, false);
        HairBands h4 = new HairBands("Rubber", "Sport", 9, true);
        HairBands h5 = new HairBands("Velvet", "Fancy", 6, true);
        HairBands h6 = new HairBands("Fabric", "Knotted", 4, false);
        HairBands h7 = new HairBands("Nylon", "Stretchable", 8, true);

        h1.display();
        h2.display();
        h3.display();
        h4.display();
        h5.display();
        h6.display();
        h7.display();
    }
}