class DeviceDriver {

    public static void main(String[] args) {

        System.out.println("Hello Device Driver System");

        getDriverInfo();

        System.out.println("I have two device counts, please add and display");

        byte keyboardDevices = 4;
        byte mouseDevices = 3;
        boolean driverInstalled = true;

        addDevices(keyboardDevices, mouseDevices, driverInstalled); // calling method

        System.out.println("What is the driver version");

        double driverVersion = getDriverVersion();
        System.out.println(driverVersion);
    }

    // no return type & no parameter
    static void getDriverInfo() {
        System.out.println("Device drivers help hardware communicate with the operating system");
    }

    // no return type & parameters
    static void addDevices(byte dev1, byte dev2, boolean installed) {
        System.out.println("Calculating total connected devices");
        int totalDevices = dev1 + dev2;
        System.out.println(totalDevices);
        System.out.println("Driver Installed: " + installed);
    }

    // return type & no parameter
    static double getDriverVersion() {
        System.out.println("Please wait, checking driver version");
        double version = 2.5;
        System.out.println("Driver version found");
        return version;
    }
}