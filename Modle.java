class Menu {

    // 8 data types
    byte menuId;            // 1. byte
    short totalItems;       // 2. short
    int itemPrice;          // 3. int
    long menuCode;          // 4. long
    float itemWeight;       // 5. float
    double totalCost;       // 6. double
    char itemType;          // 7. char
    boolean isAvailable;    // 8. boolean

    public static void main(String[] args) {

        Menu m = new Menu();

        m.menuId = 1;
        m.totalItems = 20;
        m.itemPrice = 150;
        m.menuCode = 20260201L;
        m.itemWeight = 250.5f;
        m.totalCost = 1250.75;
        m.itemType = 'V';     // V = Veg
        m.isAvailable = true;

        System.out.println("Menu ID: " + m.menuId);
        System.out.println("Total Items: " + m.totalItems);
        System.out.println("Item Price: " + m.itemPrice);
        System.out.println("Menu Code: " + m.menuCode);
        System.out.println("Item Weight: " + m.itemWeight);
        System.out.println("Total Cost: " + m.totalCost);
        System.out.println("Item Type: " + m.itemType);
        System.out.println("Available: " + m.isAvailable);
    }
}