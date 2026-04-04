class Dominos {
int orderId;
double billAmount;
String name;

Dominos() {
this(9000, 300.0, "Default Customer");
System.out.println("Dominos Const 1");
}
Dominos(int orderId, double billAmount, String name) {
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