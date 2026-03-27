class Soaps{
public static void main(String []args){

String[] SoapNames = {"Lux","Dove","Lifebuoy","Pears","Dettol","Santoor","Medimix"};
double[] SoapPrice = {35.5,40.0,32.75,45.0,38.25,36.0,42.5};
int[] SoapWeight = {75,100,80,90,85,95,110};

for(String name : SoapNames){
    System.out.println(name);
}
for(double price : SoapPrice){
    System.out.println(price);
}
for(int weight : SoapWeight){
    System.out.println(weight);
}

}
}