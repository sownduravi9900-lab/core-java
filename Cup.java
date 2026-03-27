class Cup {

    // Static variables (class variables)
    static int capacity = 300;        
    static String material = "Glass";
    static double weight = 180.5;
    static boolean hotSafe = true;
    static char grade = 'A';

    public static void main(String[] args) {

        // Local variables (method variables – different names)
        int quality = 2;
        String color = "White";
        float price = 99.50f;
        boolean filled = false;
        char use = 'D';

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("quality : " + quality);
        System.out.println("color : " + color);
        System.out.println("price : " + price);
        System.out.println("filled : " + filled);
        System.out.println("use : " + use);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("capacity : " + capacity);
        System.out.println("material : " + material);
        System.out.println("weight : " + weight);
        System.out.println("hotSafe : " + hotSafe);
        System.out.println("grade : " + grade);
    }
}