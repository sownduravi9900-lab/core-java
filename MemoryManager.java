class MemoryManager {
public static void main(String[] args) {

System.out.println("Hello Memory Manager System");
getMemoryInfo();

System.out.println("I have two memory sizes, please add and display");

int ramMemory = 4096;      
int cacheMemory = 1024;    
boolean memoryAvailable = true;

addMemory(ramMemory, cacheMemory, memoryAvailable); // calling method

System.out.println("What is the total system memory");

long totalMemory = getTotalMemory();
System.out.println(totalMemory);
}

static void getMemoryInfo() {
System.out.println("Memory manager controls RAM and cache memory usage");
}

static void addMemory(int mem1, int mem2, boolean available) {
System.out.println("Calculating total memory");
int total = mem1 + mem2;
System.out.println(total + " MB");
System.out.println("Memory Available: " + available);
    }

static long getTotalMemory() {
System.out.println("Please wait, checking system memory");
long memory = 8192L; // in MB
System.out.println("System memory retrieved successfully");
return memory;
}
}