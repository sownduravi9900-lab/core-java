class CallUsageTracker {
public static void main(String[] args) {
System.out.println("Welcome to Call Usage Tracker");
getCallServiceInfo();

System.out.println("I have two call durations, please add and display");
short localCallMinutes = 85;
short stdCallMinutes = 40;
boolean callServiceActive = true;

addCallDuration(localCallMinutes, stdCallMinutes, callServiceActive); // calling method

System.out.println("What is the total call charge");

float callCharge = getCallCharge();
System.out.println(callCharge);
}
static void getCallServiceInfo() {
System.out.println("Local and STD call usage tracking enabled");
}

static void addCallDuration(short local, short std, boolean active) {
System.out.println("Calculating total call duration");
int totalMinutes = local + std;
System.out.println(totalMinutes + " minutes");
System.out.println("Call Service Active: " + active);
    }

static float getCallCharge() {
System.out.println("Please wait, calculating call charge");
float charge = 149.75f;
System.out.println("Call charge calculated successfully");
return charge;
    }
}