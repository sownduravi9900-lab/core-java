class Bag {

    void display() {

        String brand[]={"Skybags","AmericanTourister","Wildcraft","Safari","VIP","Nike","Adidas","Puma","Reebok","Fgear"};
        int price[]={1000,2000,1500,1800,1700,2500,2400,2300,2200,1600};
        int capacity[]={20,25,30,35,40,22,24,28,26,32};

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+price[i]+" "+capacity[i]);
        }

        for(String b:brand){
            System.out.println(b);
        }
    }
}