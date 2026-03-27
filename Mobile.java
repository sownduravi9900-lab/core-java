class Mobile {

String brand = "Samsung";
int price = 20000;

void showMobile() {
System.out.println("Mobile Brand: " + brand);
}

int getPrice() {
return price;
}

void setBrand(String newBrand) {
brand = newBrand;
System.out.println("New Brand: " + brand);
}

int addPrice(int extra) {
return price + extra;
}
}