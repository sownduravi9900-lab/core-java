class NeckBand{
	String brand;
	String color;
    int price;
    int size;
public NeckBand(String brand,String color,int price,int size){
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.size = size;
}	
public NeckBand(String brand,int price,int size){
    this.brand = brand;
	this.price = price;
	this.size = size;
}

public NeckBand(String brand,String color,int size){
	this.brand = brand;
	this.color = color;
	this.size = size;
}
public NeckBand(String color,int price,int size){
	this.color = color;
	this.price = price;
	this.size = size;
}
public void display(){
System.out.println("_______________*************_____________________");
}

}