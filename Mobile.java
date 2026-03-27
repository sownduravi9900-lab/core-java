class Mobile {

    void display() {

        String brand[]={"Samsung","Vivo","Oppo","Realme","Redmi","Apple","OnePlus","Nokia","Motorola","Lava"};
        int price[]={15000,18000,17000,16000,14000,80000,35000,12000,20000,10000};
        int ram[]={4,6,8,6,4,8,12,4,6,4};

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+price[i]+" "+ram[i]);
        }

        for(String b:brand){
            System.out.println(b);
        }
    }
}