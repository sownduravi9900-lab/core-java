class VersionControl {

public static void main(String[] args) {
System.out.println("Hello Version Control System");
getVersionInfo();
System.out.println("I have two commit counts, please add and display");
short repo1Commits = 45;
short repo2Commits = 30;
char repoStatus = 'A';
manageCommits(repo1Commits, repo2Commits, repoStatus); // calling method

System.out.println("What is the current version number");
double version = getCurrentVersion();
System.out.println(version);
}

static void getVersionInfo() {
System.out.println("Version Control tracks changes in source code");
}
static void manageCommits(short c1, short c2, char status) {
System.out.println("Calculating total commits");
int totalCommits = c1 + c2;
System.out.println(totalCommits);
System.out.println("Repository Status: " + status);
}

static double getCurrentVersion() {
System.out.println("Checking current version");
double version = 2.5;
System.out.println("Version retrieved successfully");
return version;
}
}