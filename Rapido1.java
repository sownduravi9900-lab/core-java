class Rapido1 {
int rideId;
double fare;

Rapido1() {
this(5000, 120.0);
System.out.println("Rapido1 Const 1");
}

Rapido1(int rideId, double fare) {
this.rideId = rideId;
this.fare = fare;
System.out.println("Rapido1 Const 2");
System.out.println("rideId : " + rideId);
System.out.println("fare : " + fare);
System.out.println("._. ._. ._. ._. ._. ._. ._. ._. ._. ._. ");

    }
}

