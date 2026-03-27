class Gold {

    // Static Variables (Class Variables)
    static long number = 9876543210L;
    static String countryCode = "+91";
    static boolean isActive = true;
    static int areaCode = 30;
    float callRate = 6.5f;

    public static void main(String[] args) {

        // Local Variables
        long number = 2345678910L;
        boolean isActive = false;
        int areaCode = 20;
        float callRate = 3.5f;

        // Printing Static Variables
        System.out.println("number:" + number);
        System.out.println("countryCode:" + countryCode);
        System.out.println("isActive:" + isActive);
        System.out.println("areaCode:" + areaCode);
        System.out.println("callRate:" + callRate);

        // Printing Local Variables
        System.out.println("number:" + number);
        System.out.println("isActive: " + isActive);
        System.out.println("areaCode:" + areaCode);
        System.out.println("callRate:" + callRate);
    }
}