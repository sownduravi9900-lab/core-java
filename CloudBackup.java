class CloudBackup {

public static void main(String[] args) {

System.out.println("Welcome to Cloud Backup Service");
getBackupInfo();
System.out.println("I have two backup sizes, please add and display");

float photosBackup = 12.5f;   
float videosBackup = 18.75f;  
boolean backupEnabled = true;

addBackupSize(photosBackup, videosBackup, backupEnabled); 

System.out.println("What is the monthly backup cost");

int backupCost = getBackupCost();
System.out.println(backupCost);
    }

static void getBackupInfo() {
System.out.println("Automatic cloud backup is enabled");
}

static void addBackupSize(float photoSize, float videoSize, boolean enabled) {
System.out.println("Calculating total backup size");
float totalSize = photoSize + videoSize;
System.out.println(totalSize + " GB");
System.out.println("Backup Enabled: " + enabled);
    }

static int getBackupCost() {
System.out.println("Please wait, fetching backup cost");
int cost = 299;
System.out.println("Backup cost fetched successfully");
return cost;
    }
}