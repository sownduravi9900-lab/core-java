class BookMyShow {
    String customerName;
    String movieName;
    String seatType;
    double ticketPrice;

    public BookMyShow(String customerName, String movieName, String seatType, double ticketPrice) {
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatType = seatType;
        this.ticketPrice = ticketPrice;
        System.out.println("Ticket has been booked successfully on BookMyShow");
    }

    public BookMyShow(String customerName, String movieName) {
        this.customerName = customerName;
        this.movieName = movieName;
        System.out.println(movieName);
    }

    public BookMyShow(String customerName) {
        System.out.println(customerName);
        System.out.println("Welcome to BookMyShow!");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}

