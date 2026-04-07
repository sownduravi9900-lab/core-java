class Bag {

    String getStatus() {
        String status = "Ready";
        System.out.println("Status is: " + status);
        return status;
    }

    void openBag() {
        System.out.println("Bag is opening");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        openBag();
    }
}