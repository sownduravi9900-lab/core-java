class Speaker {

String brand = "Sony";
int volume = 50;

void showSpeaker() {
System.out.println("Speaker Brand: " + brand);
}

int getVolume() {
return volume;
}

void setBrand(String newBrand) {
brand = newBrand;
System.out.println("New Speaker Brand: " + brand);
}

int increaseVolume(int value) {
return volume + value;
}
}