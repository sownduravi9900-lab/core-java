class FileUploadManager {
public static void main(String[] args) {
System.out.println("Hello File Upload Manager");
getUploadInfo();
System.out.println("I have two file sizes, please add and display");
double file1Size = 25.8;double file2Size = 40.2;boolean uploadStatus = true;
calculateUploadSize(file1Size, file2Size, uploadStatus); // calling method
System.out.println("What is the upload speed");
long speed = getUploadSpeed();
System.out.println(speed);
}

static void getUploadInfo() {
System.out.println("File Upload Manager handles uploading files to the server");
}

static void calculateUploadSize(double f1, double f2, boolean status) {
System.out.println("Calculating total upload size");
double totalSize = f1 + f2;
System.out.println(totalSize);
System.out.println("Upload Status: " + status);
}

static long getUploadSpeed() {
System.out.println("Checking upload speed");
long speed = 150;
System.out.println("Upload speed retrieved successfully");
return speed;
}
}