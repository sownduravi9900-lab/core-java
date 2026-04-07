class Wire {

    String getStatus() {
        String status = "Connected";
        System.out.println("Status is: " + status);
        return status;
    }

    void plugWire() {
        System.out.println("Wire is plugging");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setLength(int length) {
        System.out.println("Length is: " + length + " meters");
        plugWire();
    }
}