class SwitchBoard {

    String getStatus() {
        String status = "ON";
        System.out.println("Status is: " + status);
        return status;
    }

    void turnOn() {
        System.out.println("SwitchBoard is turning on");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setLocation(String location) {
        System.out.println("Location is: " + location);
        turnOn();
    }
}