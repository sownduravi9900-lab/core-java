class Biscuits{
public static void main(String []args){

String[] BiscuitNames = {"Oreo","GoodDay","MarieGold","HideAndSeek","Tiger","Bourbon","MilkBikis"};
double[] BiscuitPrice = {30.5,25.0,20.75,35.0,18.25,32.0,22.5};
int[] BiscuitQuantity = {10,15,12,20,18,25,30};

for(String name : BiscuitNames){
    System.out.println(name);
}
for(double price : BiscuitPrice){
    System.out.println(price);
}
for(int qty : BiscuitQuantity){
    System.out.println(qty);
}

}
}