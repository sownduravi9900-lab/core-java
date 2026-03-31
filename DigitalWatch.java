class DigitalWatch{
    String brandName;
	int price;
	int modelNo;
	char size;
	
	public DigitalWatch(String p1,int p2,int p3,char p4){
    brandName = p1;
	price = p2;
	modelNo = p3;
	size = p4;
	}
	public void display(){
		
		System.out.println(brandName);
		System.out.println(price);
		System.out.println(modelNo);
		System.out.println(size);
	}
}