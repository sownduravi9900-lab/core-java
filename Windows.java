class Windows{
public static void main(String []args){

String[] WindowNames = {"Sliding","Casement","Awning","Bay","Fixed","Louvered","Tilt"};
double[] WindowPrice = {5000.5,6000.0,5500.75,7000.0,4500.25,5200.0,5800.5};
int[] WindowSize = {4,5,4,6,3,4,5};

for(String name : WindowNames){
    System.out.println(name);
}
for(double price : WindowPrice){
    System.out.println(price);
}
for(int size : WindowSize){
    System.out.println(size);
}

}
}