class Chocolates{
public static void main(String []args){

String[] ChocolateNames = {"DairyMilk","KitKat","FiveStar","Perk","Snickers","Mars","MilkyBar"};
double[] ChocolatePrice = {50.5,40.0,35.75,30.0,55.25,60.0,45.5};
int[] ChocolateWeight = {45,40,35,30,50,55,42};

for(String name : ChocolateNames){
    System.out.println(name);
}
for(double price : ChocolatePrice){
    System.out.println(price);
}
for(int weight : ChocolateWeight){
    System.out.println(weight);
}

}
}