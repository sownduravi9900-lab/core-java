class Car {

    void display() {

        String brand[]={"Toyota","Honda","Hyundai","Kia","Tata","Mahindra","BMW","Audi","Benz","Skoda"};
        int price[]={1000000,900000,800000,850000,750000,950000,5000000,5500000,6000000,1200000};
        int seats[]={5,5,5,5,5,7,5,5,5,5};

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+price[i]+" "+seats[i]);
        }

        for(String b:brand){
            System.out.println(b);
        }
    }
}