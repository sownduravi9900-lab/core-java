class Hyundai {

    // 3 static variables
    static String companyName = "Hyundai Motors";
    static String country = "South Korea";
    static int warrantyYears = 5;

    public static void main(String[] args) {

        // 3 local variables 
        String modelName;
        long price;
        boolean isElectric;

        modelName = "Creta";
        price = 1200000;
        isElectric = false;

        System.out.println("COMPANY NAME : " + companyName);
        System.out.println("COUNTRY : " + country);
        System.out.println("WARRANTY YEARS : " + warrantyYears);

        System.out.println("MODEL NAME : " + modelName);
        System.out.println("PRICE : " + price);
        System.out.println("ELECTRIC : " + isElectric);
    }
}