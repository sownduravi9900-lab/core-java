class PriceCalculator {

public static void main(String[] args) {
System.out.println("Welcome to Price Calculator");
getCalculatorInfo();
System.out.println("I have two product prices, please add and display");

double productOnePrice = 799.50;
double productTwoPrice = 1200.25;
boolean discountApplied = true;

addPrices(productOnePrice, productTwoPrice, discountApplied); // calling method

System.out.println("What is the final payable amount");

long payableAmount = getFinalAmount();
System.out.println(payableAmount);
}

static void getCalculatorInfo() {
System.out.println("This calculator helps calculate total product price");
}

static void addPrices(double price1, double price2, boolean discount) {
System.out.println("Calculating total price");
double totalPrice = price1 + price2;
System.out.println(totalPrice);
System.out.println("Discount Applied: " + discount);
}

static long getFinalAmount() {
System.out.println("Please wait, calculating final amount");
long amount = 1800L;
System.out.println("Final amount calculated successfully");
return amount;
}
}