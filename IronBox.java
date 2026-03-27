class IronBox {

    String brand = "Philips";
    int watts = 1000;

    void showIron() {
        System.out.println("IronBox Brand: " + brand);
    }

    int getWatts() {
        return watts;
    }

    void setBrand(String newBrand) {
        brand = newBrand;
        System.out.println("New Iron Brand: " + brand);
    }

    int increaseWatts(int value) {
        return watts + value;
    }
}