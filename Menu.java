class Menu {

  
    byte menuId;            
    short totalItems;       
    int itemPrice;          
    long menuCode;          
    float itemWeight;       
    double totalCost;       
    char itemType;          
    boolean isAvailable;    

    public static void main(String[] args) {

        Menu m = new Menu();

        m.ms = 20;
        m.itemPrice = 150;
        m.menuCode = 20260201L;
        m.itemWeight = 250.5f;
        m.totalCost = 1250.75;
        m.itemType = 'V';     
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