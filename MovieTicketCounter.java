class MovieTicketCounter {
public static void main(String[] args) {
System.out.println("Hello Movie Ticket Counter");
getCounter();

System.out.println("I have two ticket counts, please add and display");

short morningShow = 45;
short eveningShow = 65;
boolean houseFull = false;

addTickets(morningShow, eveningShow, houseFull); 

System.out.println("What is the ticket price for VIP seat");
float vipTicketPrice = getTicketPrice();
System.out.println(vipTicketPrice);
}

static void getCounter() {
System.out.println("Welcome to Movie Ticket Counter");
}

static void addTickets(short show1, short show2, boolean status) {
System.out.println("Calculating total tickets sold");
int totalTickets = show1 + show2;
System.out.println(totalTickets);
System.out.println("House Full Status: " + status);
}
static float getTicketPrice() {
System.out.println("Please wait, fetching ticket price");
float price = 280.50f;
System.out.println("Ticket price found, returning value");
return price;
}
}