class HeadphoneRunner {
public static void main(String[] args) {

Headphone.brand();
Headphone.setVolume(10);

int headphonePrice = Headphone.price();
System.out.println("Price: " + headphonePrice);

String headphoneColor = Headphone.color("Black");
System.out.println("Color: " + headphoneColor);
}
}