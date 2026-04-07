class LipStick {

    String getStatus() {
        String status = "Applied";
        System.out.println("Status is: " + status);
        return status;
    }

    void applyLipStick() {
        System.out.println("LipStick is being applied...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setColor(String color) {
        System.out.println("Color is: " + color);
        applyLipStick();
    }
}