class Oven {

    static boolean isOvenOn = false;
    static String ovenBrand = "LG";
    static double ovenTemperature = 180.5;
    static int cookingTime = 20;

static void checkOvenStatus() {
if(isOvenOn == false) {
System.out.println("Checking : Oven is OFF");
} else {
System.out.println("Checking : Oven is ON");
}
}

static void turnOnOven() {
System.out.println("Turning ON the Oven");
isOvenOn = true;
}

static int getCookingTime() {
return cookingTime;
}

}