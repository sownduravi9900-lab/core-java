class CreditCard {
long cardNumber;
double creditLimit;
CreditCard() {
this(1111222233334444L, 50000.0);
System.out.println("CreditCard Const 1");
}
CreditCard(long cardNumber, double creditLimit) {
System.out.println("CreditCard Const 2");
System.out.println("cardNumber : " + cardNumber);
System.out.println("creditLimit : " + creditLimit);
System.out.println(":}  :{  :}  :{  :}  :{  :}  :{  :}");
}
}