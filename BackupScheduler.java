class BackupScheduler {
public static void main(String[] args) {
System.out.println("Hello Backup Scheduler System");
getBackupInfo();
System.out.println("I have two backup file sizes, please add and display");
float backup1 = 45.6f;
float backup2 = 32.4f;
boolean backupStatus = true;

scheduleBackup(backup1, backup2, backupStatus); // calling method

System.out.println("What is the next backup time");
int nextBackupTime = getNextBackupTime();
System.out.println(nextBackupTime);
}

static void getBackupInfo() {
System.out.println("Backup Scheduler automatically schedules system backups");
    }

static void scheduleBackup(float b1, float b2, boolean status) {
System.out.println("Calculating total backup size");
float totalBackup = b1 + b2;
System.out.println(totalBackup);
System.out.println("Backup Status: " + status);
}

static int getNextBackupTime() {
System.out.println("Checking next backup schedule");
int time = 24;
System.out.println("Next backup scheduled successfully");
return time;
}
}