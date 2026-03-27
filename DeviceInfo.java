class DeviceInfo {
public static void main(String[] args) {
System.out.println("Hello Device Information System");
getDeviceInfo();

System.out.println("I have two storage values, please add and display");

short internalStorage = 128;   
short externalStorage = 64;    
boolean storageAvailable = true;

addStorage(internalStorage, externalStorage, storageAvailable); // calling method
System.out.println("What is the device price");

double devicePrice = getDevicePrice();
System.out.println(devicePrice);
}

static void getDeviceInfo() {
System.out.println("This device supports Android OS and 5G network");
}

    static void addStorage(short intStore, short extStore, boolean available) {
System.out.println("Calculating total storage");
int totalStorage = intStore + extStore;
System.out.println(totalStorage + " GB");
System.out.println("Storage Available: " + available);
    }

    static double getDevicePrice() {
System.out.println("Please wait, fetching device price");
double price = 28999.99;
System.out.println("Device price fetched successfully");
return price;
}
}