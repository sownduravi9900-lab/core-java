class Jewel {
String name;
String material;
int price;
boolean isPrecious;
Jewel(String name, String material, int price, boolean isPrecious) {
this.name = name;
this.material = material;
this.price = price;
this.isPrecious = isPrecious;
}
void displayDetails() {
System.out.println("Name: " + name);
System.out.println("Material: " + material);
System.out.println("Price: " + price);
System.out.println("Precious: " + isPrecious);
}
}