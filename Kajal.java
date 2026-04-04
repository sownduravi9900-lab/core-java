class Kajal {
String brand;
int price;
int quantity;
boolean isWaterproof;
void displayDetails() {
System.out.println("Brand: " + brand);
System.out.println("Price: " + price);
}
void setDetails(String b, int p, int q, boolean w) {
brand = b;
price = p;
quantity = q;
isWaterproof = w;
}
int getQuantity() {
return quantity;
}
int calculateTotal(int discount) {
int total = price * quantity;
return total - (total * discount / 100);
}
}