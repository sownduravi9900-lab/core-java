class ElectricTimerRunner{

public static void main(String[] args){

ElectricTimer.checkTimerStatus();

ElectricTimer.startTimer();


Int currentTime = ElectricTimer.getCurrentTime();
System.out.println("Current Time is :" + currentTime);
}
}