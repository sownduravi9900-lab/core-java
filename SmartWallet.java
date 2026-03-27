public class SmartWallet {
    public static void main(String[] args) {

        
        int walletId = 301;
        double balance = 8500.75;
        String ownerName = "Kiran";
        boolean isActive = true;
        char walletType = 'D'; 

        System.out.println("Initial Wallet Details:");
        System.out.println("Wallet ID: " + walletId);
        System.out.println("Balance: " + balance);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Active: " + isActive);
        System.out.println("Wallet Type: " + walletType);

        
        walletId = 302;
        balance = 9200.50;
        ownerName = "Sowndu";
        isActive = false;
        walletType = 'P';

        System.out.println("\nUpdated Wallet Details:");
        System.out.println("Wallet ID: " + walletId);
        System.out.println("Balance: " + balance);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Active: " + isActive);
        System.out.println("Wallet Type: " + walletType);
    }
}