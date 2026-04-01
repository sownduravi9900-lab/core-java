class CoolerRunner {
public static void main(String[] args) {

// check cooler status
Cooler.checkCoolerStatus();

// turn on cooler
Cooler.turnOnCooler();

// check again
Cooler.checkCoolerStatus();

// display fan speed
int speed = Cooler.getFanSpeed();
System.out.println("Cooler Fan Speed is : " + speed);

}
}