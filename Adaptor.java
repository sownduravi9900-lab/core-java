class Adaptor {

    String getStatus() {
        String status = "Charging";
        System.out.println("Status is: " + status);
        return status;
    }

    void plugAdaptor() {
        System.out.println("Adaptor is plugged in...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setVoltage(int voltage) {
        System.out.println("Voltage is: " + voltage);
        plugAdaptor();
    }
}