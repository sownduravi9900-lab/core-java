class AirPurifier {

static boolean isAirPurifierOnOrOffButton = false;
static int maxLevel = 5;
static int minLevel = 0;
static int currentLevel;

static void checkAirPurifierIsOnOrOff() {
if(isAirPurifierOnOrOffButton == false) {
System.out.println("Checking : AirPurifier is OFF");
} 
else {
System.out.println("Checking : AirPurifier is ON");
}
}

static void turnOnAirPurifier() {
System.out.println("Turning ON the AirPurifier");
isAirPurifierOnOrOffButton = true;
}

static int getCurrentLevel() {
return currentLevel;
}

static int incLevel() {
if(isAirPurifierOnOrOffButton == true) {
if(currentLevel < maxLevel) {
currentLevel = currentLevel + 1;
}
} 
else {
System.out.println("AirPurifier is OFF");
}
return currentLevel;
}
   static int decLevel() {
if(isAirPurifierOnOrOffButton == true) {
if(currentLevel > minLevel) {
currentLevel = currentLevel - 1;
}
} 
else {
System.out.println("AirPurifier is OFF");
}
return currentLevel;
}
}