class Pens{
public static void main(String []args){

String[] PenNames = {"Reynolds","Cello","Parker","Flair","Linc","Camlin","Montex"};
double[] PenPrice = {10.5,12.0,120.75,15.0,9.25,20.0,18.5};
int[] PenQuantity = {10,15,12,20,18,25,30};

for(String name : PenNames){
    System.out.println(name);
}
for(double price : PenPrice){
    System.out.println(price);
}
for(int qty : PenQuantity){
    System.out.println(qty);
}

}
}