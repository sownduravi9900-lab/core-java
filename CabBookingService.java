class CabBookingService {
public static void main(String[] args) {
System.out.println("Welcome to Cab Booking Service");
getCabServiceInfo();

System.out.println("I have two trip distances, please add and display");

float tripOneDistance = 12.5f;   
float tripTwoDistance = 8.75f; 
char cabAvailable = 'Y';         // Y = Yes

addDistance(tripOneDistance, tripTwoDistance, cabAvailable); // calling method

System.out.println("What is the estimated fare");

int estimatedFare = getEstimatedFare();
System.out.println(estimatedFare);
}

static void getCabServiceInfo() {
System.out.println("24/7 cab booking with GPS tracking available");
    }

    static void addDistance(float d1, float d2, char available) {
System.out.println("Calculating total trip distance");
float totalDistance = d1 + d2;
System.out.println(totalDistance + " km");
System.out.println("Cab Available: " + available);
}

static int getEstimatedFare() {
System.out.println("Please wait, calculating fare");
int fare = 450;
System.out.println("Fare calculated successfully");
return fare;
}
}