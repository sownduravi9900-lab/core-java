class Bottle {

    void display() {

        String brand[]={"Milton","Cello","Tupperware","Signoraware","Pigeon","Prestige","Borasil","Nayasa","Wonderchef","Solimo"};
        int capacity[]={1,2,1,1,2,1,1,2,1,2};
        int price[]={200,300,250,220,280,260,240,210,270,230};

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+capacity[i]+" "+price[i]);
        }

        for(String b:brand){
            System.out.println(b);
        }
    }
}