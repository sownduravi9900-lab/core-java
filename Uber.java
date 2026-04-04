class Uber {
int tripId;
double fare;
Uber() {
this(1000, 150.0);
System.out.println("Uber Const 1");
}
Uber(int tripId, double fare) {
this.tripId = tripId;
this.fare = fare;
System.out.println("Uber Const 2");
System.out.println("tripId : " + tripId);
System.out.println("fare : " + fare);
System.out.println("><><><><><><><><><><><><");

}
}