class ATMCard1 {
int cardNumber;
double balance;
ATMCard1() {
this(1001, 10000.0);
System.out.println("ATMCard1 Const 1");
}
ATMCard1(int cardNumber, double balance) {
this.cardNumber = cardNumber;
this.balance = balance;
System.out.println("ATMCard1 Const 2");
System.out.println("cardNumber : " + cardNumber);
System.out.println("balance : " + balance);
System.out.println("_____________!!!!!!!!!!!!!!!_______________");

}
}