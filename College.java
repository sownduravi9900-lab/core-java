class College {

    String name;
    String location;

    College(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void displayInfo() {
        System.out.println("College Name: " + name);
        System.out.println("Location: " + location);
    }

    static void collegeType() {
        System.out.println("This is a general college");
    }

    void checkOpen(String day) {
        if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("College is closed");
        } else {
            System.out.println("College is open");
        }
    }
}