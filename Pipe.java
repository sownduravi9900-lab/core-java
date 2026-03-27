class Pipe {

    // Static variables 
    static int length = 10;
    static int diameter = 5;
    static String material = "PVC";
    static float price = 250.50f;
    static boolean isAvailable = true;

    public static void main(String[] args) {

        // Local variables 
        int length = 20;
        int diameter = 8;
        String material = "Steel";
        float price = 450.75f;
        boolean isAvailable = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Length : " + length);
        System.out.println("Diameter : " + diameter);
        System.out.println("Material : " + material);
        System.out.println("Price : " + price);
        System.out.println("Available : " + isAvailable);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Length : " + Pipe.length);
        System.out.println("Diameter : " + Pipe.diameter);
        System.out.println("Material : " + Pipe.material);
        System.out.println("Price : " + Pipe.price);
        System.out.println("Available : " + Pipe.isAvailable);
    }
}