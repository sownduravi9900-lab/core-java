class Watch {

    void display() {

        String brand[]={"Titan","Fastrack","Sonata","Rolex","Casio","Timex","Boat","Noise","Fireboltt","Apple"};
        int price[]={2000,3000,1500,500000,4000,2500,3500,4500,3000,45000};
        int warranty[]={1,1,1,2,2,1,1,1,1,1};

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+price[i]+" "+warranty[i]);
        }

        for(String b:brand){
            System.out.println(b);
        }
    }
}