class Toaster {

static boolean isToasterOn = false;
static String toasterBrand = "Philips";
static double toasterPower = 800.5;
static int toastLevel = 3;

static void checkToasterStatus() {
if(isToasterOn == false) {
System.out.println("Checking : Toaster is OFF");
} else {
System.out.println("Checking : Toaster is ON");
}
}

static void turnOnToaster() {
System.out.println("Turning ON the Toaster");
isToasterOn = true;
}

static int getToastLevel() {
return toastLevel;
}

}