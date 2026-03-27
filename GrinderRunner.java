class GrinderRunner {

public static void main(String[] args) {

    // check grinder status
Grinder.checkGrinderStatus();

    // turn on grinder
Grinder.turnOnGrinder();

     // check again
Grinder.checkGrinderStatus();

    // display grinding speed
int speed = Grinder.getGrindingSpeed();
System.out.println("Grinding Speed is : " + speed);

}
}