class Bouquet {

    String getStatus() {
        String status = "Fresh";
        System.out.println("Status is: " + status);
        return status;
    }

    void arrangeBouquet() {
        System.out.println("Bouquet is being arranged...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setFlowerType(String type) {
        System.out.println("Flower type is: " + type);
        arrangeBouquet();
    }
}

