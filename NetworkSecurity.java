class NetworkSecurity {

public static void main(String[] args) {
System.out.println("Hello Network Security System");
getSecurityInfo();

System.out.println("I have two firewall request counts, please add and display");

int incomingRequests = 350;
int blockedRequests = 120;
boolean firewallActive = true;

addRequests(incomingRequests, blockedRequests, firewallActive); // calling method

System.out.println("What is the network security level");

char securityLevel = getSecurityLevel();
System.out.println(securityLevel);
}

static void getSecurityInfo() {
System.out.println("Network firewall and intrusion detection enabled");
}

static void addRequests(int req1, int req2, boolean active) {
System.out.println("Calculating total network requests");
int totalRequests = req1 + req2;
System.out.println(totalRequests);
System.out.println("Firewall Active: " + active);
}

static char getSecurityLevel() {
System.out.println("Checking security level");
char level = 'A';
System.out.println("Security level retrieved successfully");
return level;
    }
}