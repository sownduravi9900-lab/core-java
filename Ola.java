class Ola {
int rideId;
double fare;
Ola() {
this(2000, 150.0);
System.out.println("Ola Const 1");
}
Ola(int rideId, double fare) {
this.rideId = rideId;
this.fare = fare;
System.out.println("Ola Const 2");
System.out.println("rideId : " + rideId);
System.out.println("fare : " + fare);
System.out.println("_____________!!!!!!!!!!!!!!!_______________");

}
}