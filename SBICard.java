class SBICard {
long cardNumber;
double creditLimit;
SBICard() {
this(4000000000000000L, 50000.0);
System.out.println("SBICard Const 1");
}
SBICard(long cardNumber, double creditLimit) {
this.cardNumber = cardNumber;
this.creditLimit = creditLimit;
System.out.println("SBICard Const 2");
System.out.println("cardNumber : " + cardNumber);
System.out.println("creditLimit : " + creditLimit);
System.out.println("........########........");

}
}