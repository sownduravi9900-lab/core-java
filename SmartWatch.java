class SmartWatch {

    String getStatus() {
        String status = "Active";
        System.out.println("Status is: " + status);
        return status;
    }

    void startWatch() {
        System.out.println("SmartWatch is starting");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        startWatch();
    }
}
