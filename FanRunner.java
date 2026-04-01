class FanRunner {

public static void main(String[] args) {

    // check fan is on or off
     Fan.checkFanIsOnOrOff();

    // to turn ON fan
    Fan.turnOnFan();

     // check again
     Fan.checkFanIsOnOrOff();

     // display current speed
     int currentSpeed = Fan.getCurrentSpeed();
     System.out.println("Current Fan Speed is : " + currentSpeed);

}
}