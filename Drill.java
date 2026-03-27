class Drill {

static boolean isDrillOnOrOffButton = false;
static int maxSpeed = 10;
static int minSpeed = 0;
static int currentSpeed;
static void checkDrillIsOnOrOff() {
if(isDrillOnOrOffButton == false) {
System.out.println("Checking : Drill is OFF");
} 
else {
System.out.println("Checking : Drill is ON");
}
}

static void turnOnDrill() {
System.out.println("Turning ON the Drill");
isDrillOnOrOffButton = true;
}

static int getCurrentSpeed() {
return currentSpeed;
}

static int incSpeed() {
if(isDrillOnOrOffButton == true) {
if(currentSpeed < maxSpeed) {
currentSpeed = currentSpeed + 1;
}
} 
else {
System.out.println("Drill is OFF");
}
return currentSpeed;
}

static int decSpeed() {
if(isDrillOnOrOffButton == true) {
if(currentSpeed > minSpeed) {
currentSpeed = currentSpeed - 1;
}
} 
else {
System.out.println("Drill is OFF");
}
return currentSpeed;
}
}