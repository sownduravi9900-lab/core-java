public class ItemDispatch {
    public static void main(String[] args) {

        
        int dispatchId = 6001;
        double dispatchCost = 750.50;
        String itemName = "Office Chair";
        boolean dispatched = true;
        char dispatchStatus = 'A';

        
        System.out.println("Initial Item Dispatch Details:");
        System.out.println("Dispatch ID: " + dispatchId);
        System.out.println("Dispatch Cost: " + dispatchCost);
        System.out.println("Item Name: " + itemName);
        System.out.println("Dispatched: " + dispatched);
        System.out.println("Dispatch Status: " + dispatchStatus);

     
        dispatchId = 6002;
        dispatchCost = 820.75;
        itemName = "Ergonomic Chair";
        dispatched = false;
        dispatchStatus = 'B';

        System.out.println("\nUpdated Item Dispatch Details:");
        System.out.println("Dispatch ID: " + dispatchId);
        System.out.println("Dispatch Cost: " + dispatchCost);
        System.out.println("Item Name: " + itemName);
        System.out.println("Dispatched: " + dispatched);
        System.out.println("Dispatch Status: " + dispatchStatus);
    }
}