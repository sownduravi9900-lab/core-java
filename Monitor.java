class Monitor {

String size = "24 inch";
int refreshRate = 75;

void showMonitor() {
System.out.println("Monitor Size: " + size);
}

int getRate() {
return refreshRate;
}

void setSize(String newSize) {
size = newSize;
System.out.println("New Size: " + size);
}

int increaseRate(int value) {
return refreshRate + value;
}
}