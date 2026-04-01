class EarBudsRunner {

public static void main(String[] args) {

// check connection
EarBuds.checkConnection();

// connect earbuds
EarBuds.connectEarBuds();

// check again
EarBuds.checkConnection();

// display battery percentage
double battery = EarBuds.getBatteryPercentage();
System.out.println("EarBuds Battery : " + battery + "%");

}
}