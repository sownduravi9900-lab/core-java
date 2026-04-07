class Bed {

    String getStatus() {
        String status = "Ready";
        System.out.println("Status is: " + status);
        return status;
    }

    void arrangeBed() {
        System.out.println("Bed is being arranged");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setSize(String size) {
        System.out.println("Size is: " + size);
        arrangeBed();
    }
}

