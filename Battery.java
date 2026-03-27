class Battery {

static boolean isBatteryConnected = false;
static int maxCharge = 100;
static int minCharge = 0;
static int currentCharge;

static void checkBatteryConnection() {
if(isBatteryConnected == false) {
System.out.println("Checking : Battery is NOT connected");
} 
else {
System.out.println("Checking : Battery is connected");
}
}

static void connectBattery() {
System.out.println("Connecting the Battery");
isBatteryConnected = true;
}

static int getCurrentCharge() {
return currentCharge;
}

static int incCharge() {
if(isBatteryConnected == true) {
if(currentCharge < maxCharge) {
currentCharge = currentCharge + 1;
}
} 
else {
System.out.println("Battery is NOT connected");
}
return currentCharge;
}

static int decCharge() {
if(isBatteryConnected == true) {
if(currentCharge > minCharge) {
currentCharge = currentCharge - 1;
}
} 
else {
System.out.println("Battery is NOT connected");
}
return currentCharge;
}
}