class Cloth {

    String getStatus() {
        String status = "Clean";
        System.out.println("Status is: " + status);
        return status;
    }

    void wearCloth() {
        System.out.println("Cloth is being worn...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setType(String type) {
        System.out.println("Type is: " + type);
        wearCloth();
    }
}