class ATMService {
public static void main(String[] args) {
System.out.println("WELCOME TO DIGITAL ATM");
showOptions();
System.out.println("ATM usage details");

int kiosk1Users = 120;
 int kiosk2Users = 95;
char atmStatus = 'Y';  //Y=yes

processUsers(kiosk1Users, kiosk2Users, atmStatus);

double totalCash = checkCashAvailable();
 System.out.println(totalCash);
 System.out.println();
}
 static void showOptions() {
        System.out.println("ATM allows fast cash withdrawal");
        System.out.println("ATM allows cardless transaction");
        System.out.println();
}
static void processUsers(int u1, int u2, char status) {
        System.out.println("Total users today:");
        int usersCount = u1 + u2;
        System.out.println(usersCount);
        System.out.println("ATM Active Status: " + status);
        System.out.println();
		}
static double checkCashAvailable() {
        System.out.println("Checking ATM cash availability:");
        double cash = 125000.75;
        System.out.println("Cash check complete");
		return cash;
}
}