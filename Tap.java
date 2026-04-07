class Tap {

    String getStatus() {
        String status = "Flowing";
        System.out.println("Status is: " + status);
        return status;
    }

    void openTap() {
        System.out.println("Tap is opening");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setMaterial(String material) {
        System.out.println("Material is: " + material);
        openTap();
    }
}