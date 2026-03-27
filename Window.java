class Window{
public static void main(String []args){

String[] WindowNames = {"Sliding","Casement","Awning","Bay","Fixed","Louvered","Tilt"};
int []WindowPrice = {5000,6000,5500,7000,4500,5200,5800};
double []WindowSize = {4.5,5.0,4.0,6.0,3.5,4.2,4.8};

System.out.println("*****values at index 0 *****");
System.out.println(WindowNames[0]);
System.out.println(WindowPrice[0]);
System.out.println(WindowSize[0]);

System.out.println("*****values at index 1 *****");
System.out.println(WindowNames[1]);
System.out.println(WindowPrice[1]);
System.out.println(WindowSize[1]);

System.out.println("*****values at index 2 *****");
System.out.println(WindowNames[2]);
System.out.println(WindowPrice[2]);
System.out.println(WindowSize[2]);

System.out.println("*****values at index 3 *****");
System.out.println(WindowNames[3]);
System.out.println(WindowPrice[3]);
System.out.println(WindowSize[3]);

System.out.println("*****values at index 4 *****");
System.out.println(WindowNames[4]);
System.out.println(WindowPrice[4]);
System.out.println(WindowSize[4]);

System.out.println("*****values at index 5 *****");
System.out.println(WindowNames[5]);
System.out.println(WindowPrice[5]);
System.out.println(WindowSize[5]);

System.out.println("*****values at index 6 *****");
System.out.println(WindowNames[6]);
System.out.println(WindowPrice[6]);
System.out.println(WindowSize[6]);

for(String Names : WindowNames){
System.out.println(Names);
}

}
}