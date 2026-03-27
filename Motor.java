class Motor {

static boolean isMotorRunning = false;
static String motorBrand = "Kirloskar";
static double motorPower = 1.5;
static int motorRPM = 1450;

static void checkMotorStatus() {
if(isMotorRunning == false) {
System.out.println("Checking : Motor is OFF");
} else {
System.out.println("Checking : Motor is ON");
}
}

static void startMotor() {
System.out.println("Starting the Motor");
isMotorRunning = true;
}

static int getMotorRPM() {
return motorRPM;
}

}