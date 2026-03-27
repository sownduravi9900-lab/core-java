class HardwareStatus {
public static void main(String[] args) {
System.out.println("Hello Hardware Status System");
getHardwareDetails();
System.out.println("I have two hardware temperature values, please add and display");

int cpuTemp = 55;
int gpuTemp = 60;
boolean hardwareHealthy = true;

checkTemperature(cpuTemp, gpuTemp, hardwareHealthy); // calling method

System.out.println("What is the RAM size in the system");

long ramSize = getRamSize();
System.out.println(ramSize);
}

static void getHardwareDetails() {
System.out.println("Hardware includes CPU, RAM, GPU and storage devices");
}

static void checkTemperature(int temp1, int temp2, boolean healthy) {
System.out.println("Checking total temperature");
int totalTemp = temp1 + temp2;
System.out.println(totalTemp);
System.out.println("Hardware Healthy: " + healthy);
}

static long getRamSize() {
System.out.println("Please wait, checking RAM size");
long ram = 16L;
System.out.println("RAM size retrieved successfully");
return ram;
}
}