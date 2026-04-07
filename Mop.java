class Mop {

    String getStatus() {
        String status = "Clean";
        System.out.println("Status is: " + status);
        return status;
    }

    void startMop() {
        System.out.println("Mop is cleaning...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setType(String type) {
        System.out.println("Type is: " + type);
        startMop();
    }
}