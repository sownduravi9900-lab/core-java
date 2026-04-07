class Bike {

    String getStatus() {
        String status = "Running";
        System.out.println("Status is: " + status);
        return status;
    }

    void startBike() {
        System.out.println("Bike is starting...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        startBike();
    }
}