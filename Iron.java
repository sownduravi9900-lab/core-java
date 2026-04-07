class Iron {

    String getStatus() {
        String status = "Hot";
        System.out.println("Status is: " + status);
        return status;
    }

    void startIron() {
        System.out.println("Iron is heating...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setTemperature(int temp) {
        System.out.println("Temperature is: " + temp);
        startIron();
    }
}