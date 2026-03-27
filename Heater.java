class Heater {
static boolean isHeaterOnOrOffButton = false;
static int maxTemperature = 10;
static int minTemperature = 0;
static int currentTemperature;
static void checkHeaterIsOnOrOff() {
if(isHeaterOnOrOffButton == false) {
System.out.println("Checking : Heater is OFF");
} 
else {
System.out.println("Checking : Heater is ON");
}
}

static void turnOnHeater() {
System.out.println("Turning ON the Heater");
isHeaterOnOrOffButton = true;
}

static int getCurrentTemperature() {
return currentTemperature;
}

static int incTemperature() {
if(isHeaterOnOrOffButton == true) {
if(currentTemperature < maxTemperature) {
currentTemperature = currentTemperature + 1;
}
} 
else {
System.out.println("Heater is OFF");
}
return currentTemperature;
}

static int decTemperature() {
if(isHeaterOnOrOffButton == true) {
if(currentTemperature > minTemperature) {
currentTemperature = currentTemperature - 1;
}
} 
else {
System.out.println("Heater is OFF");
}
return currentTemperature;
}
}