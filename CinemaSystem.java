class CinemaSystem {

public static void main(String[] args) {

getAlexa();

System.out.println(getMoviePrice());

System.out.println("Ok alexa i want 5 movie tickets");

int tickets = 5;
int price = getTicketsPrices(tickets); // Argument
System.out.println(price);
}

static void getAlexa() {
System.out.println("hi this is Alexa.......");
}

static void toAdd(int subjectOne, int subjectTwo, boolean isPass) {
System.out.println("ok man i will add");
int marks = subjectOne + subjectTwo;
System.out.println(marks);
System.out.println(isPass);
}
static long getMoviePrice() {
System.out.println("yes wait for 1 min");
long price = 550;
System.out.println("yes i found the price");
return price;
}

static int getTicketsPrices(int price) {
System.out.println("yeassss boss");
int ticketsPrice = price * 550;
return ticketsPrice;
}
}