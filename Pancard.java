class Pancard {

    // Static variables
    static String holderName = "Ravi Kumar";
    static String panNumber = "ABCDE1234F";
    static int birthYear = 1998;
    static char gender = 'M';
    static boolean isValid = true;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String holderName = "Sowndu Ravi";
        String panNumber = "PQRSX5678Z";
        int birthYear = 2000;
        char gender = 'M';
        boolean isValid = false;

        // Printing Local Variables
        System.out.println("Local Variables:");
        System.out.println("Holder Name : " + holderName);
        System.out.println("PAN Number  : " + panNumber);
        System.out.println("Birth Year : " + birthYear);
        System.out.println("Gender     : " + gender);
        System.out.println("Is Valid   : " + isValid);

        // Printing Static Variables
        System.out.println("\nStatic Variables:");
        System.out.println("Holder Name : " + Pancard.holderName);
        System.out.println("PAN Number  : " + Pancard.panNumber);
        System.out.println("Birth Year : " + Pancard.birthYear);
        System.out.println("Gender     : " + Pancard.gender);
        System.out.println("Is Valid   : " + Pancard.isValid);
    }
}