class Bicycle {

    String getStatus() {
        String status = "Ready";
        System.out.println("Status is: " + status);
        return status;
    }

    void rideBicycle() {
        System.out.println("Bicycle is riding...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setGear(int gear) {
        System.out.println("Gear is: " + gear);
        rideBicycle();
    }
}