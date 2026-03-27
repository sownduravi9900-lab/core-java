class CourseEnrollment {
public static void main(String[] args) {
System.out.println("Hello Course Enrollment System");
getEnrollmentInfo();

System.out.println("I have two course fees, please add and display");

double javaFee = 12500.75;
double pythonFee = 10999.50;
char enrollmentStatus = 'Y';   // Y = Enrolled, N = Not Enrolled

addFees(javaFee, pythonFee, enrollmentStatus); // calling method

System.out.println("What is the registration charge");

int registrationFee = getRegistrationFee();
System.out.println(registrationFee);
}

static void getEnrollmentInfo() {
System.out.println("Welcome to the Course Enrollment Portal");
}

static void addFees(double fee1, double fee2, char status) {
System.out.println("Calculating total course fee");
double totalFee = fee1 + fee2;
System.out.println(totalFee);
System.out.println("Enrollment Status: " + status);
}

static int getRegistrationFee() {
System.out.println("Please wait, fetching registration fee");
int fee = 1500;
System.out.println("Registration fee fetched successfully");
return fee;
}
}