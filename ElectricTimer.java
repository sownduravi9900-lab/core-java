class ElectricTimer {

static boolean isTimerOnOrOffButton = false;
static int maxTime = 60;
static int minTime = 0;
static int currentTime;

static void checkTimerIsOnOrOff() {
if(isTimerOnOrOffButton == false) {
System.out.println("Checking : Timer is OFF");
} else {
System.out.println("Checking : Timer is ON");
}
}

static void turnOnTimer() {
System.out.println("Turning ON the Timer");
isTimerOnOrOffButton = true;
}

static int getCurrentTime() {
return currentTime;
}

static int incTime() {
if(isTimerOnOrOffButton == true) {
if(currentTime < maxTime) {
currentTime = currentTime + 1;
}
} else {
System.out.println("Timer is OFF");
}
return currentTime;
}

static int decTime() {
if(isTimerOnOrOffButton == true) {
if(currentTime > minTime) {
currentTime = currentTime - 1;
}
} else {
System.out.println("Timer is OFF");
}
return currentTime;
}
}