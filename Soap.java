class Soap{
public static void main(String []args){

String[] SoapNames = {"Lux","Dove","Lifebuoy","Pears","Dettol","Santoor","Medimix"};
int []SoapPrice = {30,40,35,45,38,36,42};
double []SoapWeight = {75.5,100.0,80.5,90.0,85.5,95.0,110.5};

System.out.println("*****values at index 0 *****");
System.out.println(SoapNames[0]);
System.out.println(SoapPrice[0]);
System.out.println(SoapWeight[0]);

System.out.println("*****values at index 1 *****");
System.out.println(SoapNames[1]);
System.out.println(SoapPrice[1]);
System.out.println(SoapWeight[1]);

System.out.println("*****values at index 2 *****");
System.out.println(SoapNames[2]);
System.out.println(SoapPrice[2]);
System.out.println(SoapWeight[2]);

System.out.println("*****values at index 3 *****");
System.out.println(SoapNames[3]);
System.out.println(SoapPrice[3]);
System.out.println(SoapWeight[3]);

System.out.println("*****values at index 4 *****");
System.out.println(SoapNames[4]);
System.out.println(SoapPrice[4]);
System.out.println(SoapWeight[4]);

System.out.println("*****values at index 5 *****");
System.out.println(SoapNames[5]);
System.out.println(SoapPrice[5]);
System.out.println(SoapWeight[5]);

System.out.println("*****values at index 6 *****");
System.out.println(SoapNames[6]);
System.out.println(SoapPrice[6]);
System.out.println(SoapWeight[6]);

for(String Names : SoapNames){
System.out.println(Names);
}

}
}