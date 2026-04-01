class BatteryRunner {

    public static void main(String[] args) {

   // check battery status
Battery.checkBatteryStatus();

  // insert battery
Battery.insertBattery();

   // check again
Battery.checkBatteryStatus();

    // display battery level
int level = Battery.getBatteryLevel();
System.out.println("Battery Level is : " + level + "%");

}
}