class HeaterRunner {

public static void main(String[] args) {

// check heater status
Heater.checkHeaterStatus();

// turn on heater
Heater.turnOnHeater();

// check again
Heater.checkHeaterStatus();

// display heating level
int level = Heater.getHeatingLevel();
System.out.println("Heating Level is : " + level);

}
}