class GamingHeadsetRunner {
public static void main(String[] args) {
System.out.println(GamingHeadset.brand);

String brand = GamingHeadset.getBrand();
System.out.println(brand);

double price = GamingHeadset.getPrice();
System.out.println(price);

int batteryLife = GamingHeadset.getBatteryLife();
System.out.println(batteryLife);

float weight = GamingHeadset.getWeight();
System.out.println(weight);

boolean wireless = GamingHeadset.getIsWireless();
System.out.println(wireless);
}
}