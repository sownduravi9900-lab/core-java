public class KajalRunner {
public static void main(String[] args) {
Kajal kajal = new Kajal();
kajal.setDetails("Maybelline", 200, 3, true);
kajal.displayDetails();
System.out.println("Quantity: " + kajal.getQuantity());
System.out.println("Total after discount: " + kajal.calculateTotal(10));
System.out.println("____________**************____________");
}
}