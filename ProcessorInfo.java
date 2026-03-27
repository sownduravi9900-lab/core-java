class ProcessorInfo {

 public static void main(String[] args) {

System.out.println("Hello Processor Information System");

getProcessorDetails();

System.out.println("I have two processor core counts, please add and display");

short coreCountCPU1 = 8;
short coreCountCPU2 = 6;
boolean processorActive = true;

addCores(coreCountCPU1, coreCountCPU2, processorActive); // calling method

System.out.println("What is the processor speed");

float processorSpeed = getProcessorSpeed();
System.out.println(processorSpeed);
}

static void getProcessorDetails() {
System.out.println("Processor handles all instructions in the computer");
}

static void addCores(short core1, short core2, boolean active) {
System.out.println("Calculating total processor cores");
int totalCores = core1 + core2;
System.out.println(totalCores);
System.out.println("Processor Active: " + active);
    }

static float getProcessorSpeed() {
System.out.println("Please wait, checking processor speed");
float speed = 3.5f; // GHz
System.out.println("Processor speed retrieved successfully");
return speed;
}
}