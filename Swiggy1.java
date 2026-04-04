class Swiggy1 {
int orderId;
double price;
Swiggy1() {
this(1000, 250.0);
System.out.println("Swiggy1 Const 1");
}

Swiggy1(int orderId, double price) {
this.orderId = orderId;
this.price = price;
System.out.println("Swiggy1 Const 2");
System.out.println("orderId : " + orderId);
System.out.println("price : " + price);
System.out.println("........########........");

}
}

