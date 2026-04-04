class Steel {
String type;
String grade;
int price;
boolean isAlloy;
Steel(String type, String grade, int price, boolean isAlloy) {
this.type = type;
this.grade = grade;
this.price = price;
this.isAlloy = isAlloy;
}
void displayDetails() {
System.out.println("Type: " + type);
System.out.println("Grade: " + grade);
System.out.println("Price: " + price);
System.out.println("Alloy: " + isAlloy);
}
}