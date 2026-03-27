class Paint {

    // Static variables (class variables)
    static int paintId = 301;
    static String brand = "AsianPaints";
    static double volume = 1.0;      
    static boolean washable = true;
    static char type = 'E';  // E = Emulsion, O = Oil

    public static void main(String[] args) {

        // Local variables 
        int quantity = 5;                   
        String color = "Blue";           
        float price = 450.5f;           
        boolean applied = false;      
        char status = 'Available';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("quantity : " + quantity);
        System.out.println("color : " + color);
        System.out.println("price : " + price);
        System.out.println("applied : " + applied);
        System.out.println("status : " + status);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("paintId : " + paintId);
        System.out.println("brand : " + brand);
        System.out.println("volume : " + volume);
        System.out.println("washable : " + washable);
        System.out.println("type : " + type);
    }
}