class Shampoos{
public static void main(String []args){

String[] ShampooNames = {"ClinicPlus","Sunsilk","Dove","Pantene","Head&Shoulders","Tresemme","Loreal"};
double[] ShampooPrice = {120.5,110.0,150.75,140.0,160.25,180.0,200.5};
int[] QuantityML = {180,170,200,190,210,220,230};

for(String name : ShampooNames){
    System.out.println(name);
}
for(double price : ShampooPrice){
    System.out.println(price);
}
for(int qty : QuantityML){
    System.out.println(qty);
}

}
}