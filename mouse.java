class Mouse {
String type = "Wireless";
int dpi = 1600;

void showMouse() {
System.out.println("Mouse Type: " + type);
}

int getDpi() {
return dpi;
}

void setType(String newType) {
type = newType;
System.out.println("New Mouse Type: " + type);
}

int increaseDpi(int value) {
return dpi + value;
}
}