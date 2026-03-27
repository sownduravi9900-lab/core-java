class Fans{
public static void main(String []args){

String[] FanNames = {"Usha","Havells","Orient","Crompton","Bajaj","Atomberg","Khaitan"};
double[] FanPrice = {2200.5,2500.0,2300.75,2400.0,2100.25,3000.0,2000.5};
int[] FanWatt = {70,75,65,80,60,50,55};

for(String name : FanNames){
    System.out.println(name);
}
for(double price : FanPrice){
    System.out.println(price);
}
for(int watt : FanWatt){
    System.out.println(watt);
}

}
}