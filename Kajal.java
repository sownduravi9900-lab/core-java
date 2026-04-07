class Kajal {

    String getStatus() {
        String status = "Applied";
        System.out.println("Status is: " + status);
        return status;
    }

    void applyKajal() {
        System.out.println("Kajal is being applied...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        applyKajal();
    }
}