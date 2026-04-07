class EarPhone {

    String getStatus() {
        String status = "Connected";
        System.out.println("Status is: " + status);
        return status;
    }

    void startAudio() {
        System.out.println("EarPhone is starting audio");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        startAudio();
    }
}