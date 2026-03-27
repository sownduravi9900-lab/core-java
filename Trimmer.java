class Trimmer {

    static boolean isTrimmerOn = false;
    static String trimmerBrand = "Philips";
    static double batteryPercentage = 65.5;
    static int trimLevel = 4;

 static void checkTrimmerStatus() {
 if(isTrimmerOn == false) {
System.out.println("Checking : Trimmer is OFF");
} else {
System.out.println("Checking : Trimmer is ON");
}
}

static void turnOnTrimmer() {
System.out.println("Turning ON the Trimmer");
isTrimmerOn = true;
}

static int getTrimLevel() {
return trimLevel;
}

}