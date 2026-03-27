class WaterBillService {

 public static void main(String[] args) {

  System.out.println("Welcome to Water Bill Service");
getWaterServiceInfo();

  System.out.println("I have two meter readings, please add and display");

int previousReading = 2450;
int currentReading = 2685;
boolean supplyActive = true;

addReadings(previousReading, currentReading, supplyActive); // calling method

System.out.println("What is the monthly water bill amount");

long billAmount = getBillAmount();
System.out.println(billAmount);
}

static void getWaterServiceInfo() {
System.out.println("Municipal water supply available daily");
}

   
static void addReadings(int prev, int curr, boolean active) {
System.out.println("Calculating total water consumption");
        int totalUsage = curr - prev;
        System.out.println(totalUsage + " units");
        System.out.println("Water Supply Active: " + active);
}

static long getBillAmount() {
        System.out.println("Please wait, calculating water bill");
        long amount = 1350L;
        System.out.println("Water bill calculated successfully");
        return amount;
}
}