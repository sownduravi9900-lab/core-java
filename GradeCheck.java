class GradeCheck {

int marks = 75;
String name = "Ravi";

void checkGrade() {
if (marks >= 90) {
System.out.println("Grade A");
} else if (marks >= 75) {
System.out.println("Grade B");
} else if (marks >= 60) {
System.out.println("Grade C");
} else {
System.out.println("Fail");
}
}

void displayDetails() {
System.out.println("Student Name: " + name);
System.out.println("Marks: " + marks);
    }
}