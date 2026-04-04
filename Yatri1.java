class Yatri1 {
int tripId;
double fare;
Yatri1() {
this(8000, 100.0);
System.out.println("Yatri1 Const 1");
}
Yatri1(int tripId, double fare) {
this.tripId = tripId;
this.fare = fare;
System.out.println("Yatri1 Const 2");
System.out.println("tripId : " + tripId);
System.out.println("fare : " + fare);
System.out.println("=========__________==========");

}
}