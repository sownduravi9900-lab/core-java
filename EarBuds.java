class EarBuds {
static boolean isEarBudsConnected = false;
static int maxVolume = 10;
static int minVolume = 0;
static int currentVolume;
static void checkEarBudsConnection() {
if(isEarBudsConnected == false) {
System.out.println("Checking : EarBuds are NOT connected");
} 
else {
System.out.println("Checking : EarBuds are connected");
}
}

static void connectEarBuds() {
System.out.println("Connecting EarBuds");
isEarBudsConnected = true;
}

static int getCurrentVolume() {
return currentVolume;
}

static int incVolume() {
if(isEarBudsConnected == true) {
if(currentVolume < maxVolume) {
currentVolume = currentVolume + 1;
}
} 
else {
System.out.println("EarBuds are NOT connected");
}
return currentVolume;
}

static int decVolume() {
if(isEarBudsConnected == true) {
if(currentVolume > minVolume) {
currentVolume = currentVolume - 1;
}
} 
else {
System.out.println("EarBuds are NOT connected");
}
return currentVolume;
}
}