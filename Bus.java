class Bus {

    String getStatus() {
        String status = "Moving";
        System.out.println("Status is: " + status);
        return status;
    }

    void startBus() {
        System.out.println("Bus is starting...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setRoute(String route) {
        System.out.println("Route is: " + route);
        startBus();
    }
}

