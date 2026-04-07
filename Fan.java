class Fan {

    int getSpeed() {
        int speed = 3;
        System.out.println("Speed is: " + speed);
        return speed;
    }

    void setBrand(String brand) {
        System.out.println("Brand is: " + brand);
        int s = getSpeed();
        System.out.println("Returned Speed: " + s);
    }

    void showDetails() {
        System.out.println("Fan details");
        setBrand("Usha");
    }
}

