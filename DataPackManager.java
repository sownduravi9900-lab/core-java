class DataPackManager {

 public static void main(String[] args) {
System.out.println("Hello Data Pack Manager");
getDataPackManager();

System.out.println("I have two data usages, please add and display");
float dayUsage = 1.75f;     
float nightUsage = 2.25f;   
boolean isActive = true;
addUsage(dayUsage, nightUsage, isActive);
System.out.println("What is the price of monthly data pack");
double packPrice = getPackPrice();
System.out.println(packPrice);
}
 static void getDataPackManager() {
System.out.println("Hello, this is Data Pack Manager service");
}

static void addUsage(float usageOne, float usageTwo, boolean status) {
        System.out.println("Calculating total data usage");
        float totalUsage = usageOne + usageTwo;
        System.out.println(totalUsage + " GB");
        System.out.println("Service Active: " + status);
}
static double getPackPrice() {
        System.out.println("Please wait while fetching pack price");
        double price = 399.99;
        System.out.println("Price fetched successfully");
        return price;
}
}