public class DeliveryStatus {
    public static void main(String[] args) {

       
        int deliveryId = 8001;
        double deliveryCharge = 120.50;
        String deliveryPerson = "Arjun";
        boolean delivered = true;
        char deliveryGrade = 'A';

        
        System.out.println("Initial Delivery Status:");
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Delivery Person: " + deliveryPerson);
        System.out.println("Delivered: " + delivered);
        System.out.println("Delivery Grade: " + deliveryGrade);

       
        deliveryId = 8002;
        deliveryCharge = 150.75;
        deliveryPerson = "Suresh";
        delivered = false;
        deliveryGrade = 'B';

        System.out.println("\nUpdated Delivery Status:");
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Delivery Person: " + deliveryPerson);
        System.out.println("Delivered: " + delivered);
        System.out.println("Delivery Grade: " + deliveryGrade);
    }
}