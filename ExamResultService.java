 class ExamResultService {

public static void main(String[] args) {

System.out.println("Welcome to Exam Result Service");

getResultInfo();

System.out.println("I have two subject marks, please add and display");

byte mathsMarks = 88;
byte scienceMarks = 92;
boolean resultPublished = true;

addMarks(mathsMarks, scienceMarks, resultPublished); // calling method

System.out.println("What is the overall percentage");

float percentage = getPercentage();
System.out.println(percentage);
}

static void getResultInfo() {
System.out.println("Exam results for all students are available online");
}

static void addMarks(byte mark1, byte mark2, boolean published) {
System.out.println("Calculating total marks");
int totalMarks = mark1 + mark2;
System.out.println(totalMarks);
System.out.println("Result Published: " + published);
}

static float getPercentage() {
System.out.println("Please wait, calculating percentage");
float percent = 90.0f;
System.out.println("Percentage calculated successfully");
return percent;
}
}   