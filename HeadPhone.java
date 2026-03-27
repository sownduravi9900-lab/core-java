class Headphone {
String model = "Boat";
int battery = 30;

void showHeadphone() {
System.out.println("Headphone Model: " + model);
}
int getBattery() {
return battery;
}

void setModel(String newModel) {
model = newModel;
System.out.println("New Model: " + model);
}

int addBattery(int value) {
return battery + value;
}
}