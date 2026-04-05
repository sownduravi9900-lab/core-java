class Uber1 {

    int tripId;
    double fare;
    String customerName;

    Uber1() {
        this(1000, 150.0, "Default Customer");
        System.out.println("Uber1 Const 1");
    }

    Uber1(int tripId, double fare, String customerName) {
        this.tripId = tripId;
        this.fare = fare;
        this.customerName = customerName;

        System.out.println("Uber1 Const 2");
        System.out.println("tripId : " + tripId);
        System.out.println("fare : " + fare);
        System.out.println("customerName : " + customerName);
    }
}