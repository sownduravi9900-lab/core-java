class AirPurifierRunner {
public static void main(String[] args) {
// check air purifier status
AirPurifier.checkAirPurifierStatus();

// turn on air purifier
AirPurifier.turnOnAirPurifier();

// check again
AirPurifier.checkAirPurifierStatus();

// display fan speed
int speed = AirPurifier.getFanSpeed();
System.out.println("Air Purifier Fan Speed is : " + speed);
}
}