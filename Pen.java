class Pens{
public static void main(String []args){

String[] PenNames = {"Reynolds","Cello","Parker","Flair","Linc","Camlin","Montex"};
int []PenPrice = {10,15,120,20,12,25,18};
double []PenLength = {5.5,6.0,7.5,8.0,9.5,10.0,11.5};

System.out.println("*****values at index 0 *****");
System.out.println(PenNames[0]);
System.out.println(PenPrice[0]);
System.out.println(PenLength[0]);

System.out.println("*****values at index 1 *****");
System.out.println(PenNames[1]);
System.out.println(PenPrice[1]);
System.out.println(PenLength[1]);

System.out.println("*****values at index 2 *****");
System.out.println(PenNames[2]);
System.out.println(PenPrice[2]);
System.out.println(PenLength[2]);

System.out.println("*****values at index 3 *****");
System.out.println(PenNames[3]);
System.out.println(PenPrice[3]);
System.out.println(PenLength[3]);

System.out.println("*****values at index 4 *****");
System.out.println(PenNames[4]);
System.out.println(PenPrice[4]);
System.out.println(PenLength[4]);

System.out.println("*****values at index 5 *****");
System.out.println(PenNames[5]);
System.out.println(PenPrice[5]);
System.out.println(PenLength[5]);

System.out.println("*****values at index 6 *****");
System.out.println(PenNames[6]);
System.out.println(PenPrice[6]);
System.out.println(PenLength[6]);

for(String Names : PenNames){
System.out.println(Names);
}

}
}