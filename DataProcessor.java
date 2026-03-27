class DataProcessor {
public static void main(String[] args) {
System.out.println("Hello Data Processing System");
getProcessorInfo();
System.out.println("I have two data packet sizes, please add and display");

double packet1 = 45.5;
double packet2 = 30.3;
char processStatus = 'Y';
processPackets(packet1, packet2, processStatus); // calling method
System.out.println("What is the processing speed");

int speed = getProcessingSpeed();
System.out.println(speed);
}

static void getProcessorInfo() {
System.out.println("Data Processor handles and processes large data packets");
}

static void processPackets(double p1, double p2, char status) {
System.out.println("Calculating total packet size");
double totalPacket = p1 + p2;
System.out.println(totalPacket);
System.out.println("Processing Status: " + status);
    }

static int getProcessingSpeed() {
System.out.println("Please wait, checking processing speed");
int speed = 3200;
System.out.println("Processing speed retrieved successfully");
return speed;
}
}