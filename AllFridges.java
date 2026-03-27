class AllFridges {

    public static void main(String[] args){

        System.out.println("LG Fridges");
        String[] lg = LGFridge.getFridgeModels();
        for(String l : lg){
            System.out.println(l);
        }

        System.out.println("Samsung Fridges");
        String[] samsung = SamsungFridge.getFridgeModels();
        for(String s : samsung){
            System.out.println(s);
        }

        System.out.println("Whirlpool Fridges");
        String[] whirl = WhirlpoolFridge.getFridgeModels();
        for(String w : whirl){
            System.out.println(w);
        }

        System.out.println("Godrej Fridges");
        String[] godrej = GodrejFridge.getFridgeModels();
        for(String g : godrej){
            System.out.println(g);
        }

        System.out.println("Haier Fridges");
        String[] haier = HaierFridge.getFridgeModels();
        for(String h : haier){
            System.out.println(h);
        }

        System.out.println("Bosch Fridges");
        String[] bosch = BoschFridge.getFridgeModels();
        for(String b : bosch){
            System.out.println(b);
        }

        System.out.println("Voltas Fridges");
        String[] voltas = VoltasFridge.getFridgeModels();
        for(String v : voltas){
            System.out.println(v);
        }

        System.out.println("Hitachi Fridges");
        String[] hitachi = HitachiFridge.getFridgeModels();
        for(String hi : hitachi){
            System.out.println(hi);
        }

        System.out.println("Electrolux Fridges");
        String[] elect = ElectroluxFridge.getFridgeModels();
        for(String e : elect){
            System.out.println(e);
        }

    }
}