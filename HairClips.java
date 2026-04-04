class HairClips {
String clipType;
String material;
String color;
boolean isDecorated;
double length;

void displayDetails() {
System.out.println("Clip Type: " + clipType);
System.out.println("Material: " + material);
System.out.println("Color: " + color);
}

double getLength() {
return length;
}
void setDecoration(boolean value) {
isDecorated = value;
System.out.println("Decorated: " + isDecorated);
}

double doubleLength() {
return length;
}
}