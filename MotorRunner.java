class MotorRunner {

public static void main(String[] args) {

    // check motor status
Motor.checkMotorStatus();

    // start motor
Motor.startMotor();

    // check again
Motor.checkMotorStatus();

    // display motor RPM
int rpm = Motor.getMotorRPM();
System.out.println("Motor RPM is : " + rpm);

}
}