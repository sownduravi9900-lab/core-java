class Dominos1 {
int orderId;
double billAmount;
String name;

Dominos1() {
this(1000, 800.0, "Default Customer");
System.out.println("Dominos Const 1");
}
Dominos1(int orderId, double billAmount, String name) {
this.orderId = orderId;
this.billAmount = billAmount;
this.name = name;
System.out.println("Dominos Const 2");
System.out.println("orderId : " + orderId);
System.out.println("billAmount : " + billAmount);
System.out.println("name : " + name);
System.out.println("........$$$$$$$$$..........");
}
}