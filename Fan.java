class Fan{
public static void main(String []args){

String[] FanNames = {"Usha","Havells","Orient","Crompton","Bajaj","Atomberg","Khaitan"};
int []FanPrice = {2200,2500,2300,2400,2100,3000,2000};
double []FanWatt = {70.5,75.0,65.5,80.0,60.5,50.0,55.5};

System.out.println("*****values at index 0 *****");
System.out.println(FanNames[0]);
System.out.println(FanPrice[0]);
System.out.println(FanWatt[0]);

System.out.println("*****values at index 1 *****");
System.out.println(FanNames[1]);
System.out.println(FanPrice[1]);
System.out.println(FanWatt[1]);

System.out.println("*****values at index 2 *****");
System.out.println(FanNames[2]);
System.out.println(FanPrice[2]);
System.out.println(FanWatt[2]);

System.out.println("*****values at index 3 *****");
System.out.println(FanNames[3]);
System.out.println(FanPrice[3]);
System.out.println(FanWatt[3]);

System.out.println("*****values at index 4 *****");
System.out.println(FanNames[4]);
System.out.println(FanPrice[4]);
System.out.println(FanWatt[4]);

System.out.println("*****values at index 5 *****");
System.out.println(FanNames[5]);
System.out.println(FanPrice[5]);
System.out.println(FanWatt[5]);

System.out.println("*****values at index 6 *****");
System.out.println(FanNames[6]);
System.out.println(FanPrice[6]);
System.out.println(FanWatt[6]);

for(String Names : FanNames){
System.out.println(Names);
}

}
}