class Grinder {

static boolean isGrinderOn = false;
static String grinderBrand = "Preethi";
static double grinderPower = 750.5;
static int grindingSpeed = 3;

static void checkGrinderStatus() {
if(isGrinderOn == false) {
System.out.println("Checking : Grinder is OFF");
} else {
System.out.println("Checking : Grinder is ON");
}
}

static void turnOnGrinder() {
System.out.println("Turning ON the Grinder");
isGrinderOn = true;
    }

    static int getGrindingSpeed() {
        return grindingSpeed;
    }

}