class BookMyShowRunner {

    public static void main(String[] args) {

        System.out.println("Book your ticket on BookMyShow");

        BookMyShow booking = new BookMyShow("Sowndarya","KGF","Gold Class",450.00);

        System.out.println("Track your booking");

        BookMyShow track = new BookMyShow("Sowndarya", "KGF");
		
        BookMyShow profile = new BookMyShow("Sowndarya");
    }
}