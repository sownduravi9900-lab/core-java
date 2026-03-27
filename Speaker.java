class Speaker {

    void display() {

        String brand[]={"Boat","JBL","Sony","Zebronics","Mi","Realme","Philips","LG","Samsung","Portronics"};
        int price[]={1500,3000,3500,1200,1800,2000,2200,2500,2700,1600};
        int watt[]={10,20,25,8,12,15,18,22,24,14};

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+price[i]+" "+watt[i]);
        }

        for(String b:brand){
            System.out.println(b);
        }
    }
}