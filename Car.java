class Car {
    String getStatus() {
    String status = "Running";
    System.out.println("Status is: " + status);
    return status;
}

    void startCar() {
        System.out.println("Car is starting...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
}

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        startCar();
    }
}

class CarRunner {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota");
    }
}