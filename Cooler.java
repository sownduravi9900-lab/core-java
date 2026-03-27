class Cooler {

static boolean isCoolerOnOrOffButton = false;
static int maxSpeed = 5;
static int minSpeed = 0;
static int currentSpeed;

static void checkCoolerIsOnOrOff() {
if(isCoolerOnOrOffButton == false) {
System.out.println("Checking : Cooler is OFF");
} 
else {
System.out.println("Checking : Cooler is ON");
}
}
static void turnOnCooler() {
System.out.println("Turning ON the Cooler");
isCoolerOnOrOffButton = true;
}

static int getCurrentSpeed() {
return currentSpeed;
}

static int incSpeed() {
if(isCoolerOnOrOffButton == true) {
if(currentSpeed < maxSpeed) {
currentSpeed = currentSpeed + 1;
}
} 
else {
System.out.println("Cooler is OFF");
}
return currentSpeed;
}

static int decSpeed() {
if(isCoolerOnOrOffButton == true) {
if(currentSpeed > minSpeed) {
currentSpeed = currentSpeed - 1;
}
} 
else {
System.out.println("Cooler is OFF");
}
return currentSpeed;
}
}