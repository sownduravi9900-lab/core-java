class Laptop {

    void display() {

        String brand[]={"Dell","HP","Lenovo","Asus","Acer","Apple","Samsung","MSI","LG","Sony"};
        int price[]={50000,60000,55000,65000,52000,120000,70000,80000,58000,62000};
        int ram[]={8,16,8,16,8,16,12,16,8,12};

        System.out.println("Laptop using index");

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+price[i]+" "+ram[i]);
        }

        System.out.println("Laptop using forEach");

        for(String b:brand){
            System.out.println(b);
        }
    }
}