class BookStore {

    // 3 static variables
    static String storeName = "Readers Hub";
    static String location = "Bangalore";
    static int totalBooks = 12000;

    public static void main(String[] args) {

        // 3 local variables
        String bookTitle;
        double price;
        boolean isAvailable;

        bookTitle = "Java Programming";
        price = 499.50;
        isAvailable = true;

        System.out.println("Store Name   : " + storeName);
        System.out.println("Location     : " + location);
        System.out.println("Total Books  : " + totalBooks);
        System.out.println("Book Title   : " + bookTitle);
        System.out.println("Price        : " + price);
        System.out.println("Available    : " + isAvailable);
    }
}