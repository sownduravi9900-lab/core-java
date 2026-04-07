class Projector {

    String getStatus() {
        String status = "On";
        System.out.println("Status is: " + status);
        return status;
    }

    void startProjector() {
        System.out.println("Projector is starting...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        startProjector();
    }
}