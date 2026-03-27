class Gas {

    // Static variables 
    static int cylinderId = 501;
    static String brand = "Indane";
    static double capacity = 14.2; 
    static boolean refillable = true;
    static char type = 'LPG'; 

    public static void main(String[] args) {

        // Local variables 
        int quantity = 2;               
        String customer = "Ravi";  
        float price = 950.5f;      
        boolean delivered = false;
        char status = 'Active';         

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("quantity : " + quantity);
        System.out.println("customer : " + customer);
        System.out.println("price : " + price);
        System.out.println("delivered : " + delivered);
        System.out.println("status : " + status);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("cylinderId : " + cylinderId);
        System.out.println("brand : " + brand);
        System.out.println("capacity : " + capacity);
        System.out.println("refillable : " + refillable);
        System.out.println("type : " + type);
    }
}