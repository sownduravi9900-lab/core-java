class FanRunner {
public static void main(String[] args) {

System.out.println("Running Fan Class");
Fan.checkFanIsOnOrOff();
Fan.turnOnFan();
Fan.checkFanIsOnOrOff();

int currentSpeed = Fan.getCurrentSpeed();
System.out.println("Current Speed is : " + currentSpeed);

        System.out.println("Increasing " + Fan.incSpeed());
        System.out.println("Increasing " + Fan.incSpeed());
        System.out.println("Increasing " + Fan.incSpeed());
        System.out.println("Increasing " + Fan.incSpeed());
        System.out.println("Increasing " + Fan.incSpeed());

        System.out.println("Decreasing " + Fan.decSpeed());
        System.out.println("Decreasing " + Fan.decSpeed());
        System.out.println("Decreasing " + Fan.decSpeed());
        System.out.println("Decreasing " + Fan.decSpeed());
        System.out.println("Decreasing " + Fan.decSpeed());
    }
}