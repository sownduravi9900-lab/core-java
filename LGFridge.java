class LGFridge {

static String[] fridgeModels = {"GL-B201","GL-T292","GL-S382","GL-B257","GL-T302","GL-D201","GL-M322","GL-X247"};
static double[] fridgePrices = {25000,30000,42000,60000,35000,22000,40000,75000};
static int[] fridgeCapacity = {190,260,340,687,284,190,335,650};
static int[] fridgeRating = {4,4,5,5,4,3,4,5};
static int[] fridgeWarranty = {1,1,1,1,1,1,1,1};

public static void main(String[] args){

    String[] models = getFridgeModels();
    double[] prices = getFridgePrices();
    int[] capacity = getFridgeCapacity();
    int[] rating = getFridgeRating();
    int[] warranty = getFridgeWarranty();

    for(String m : models){
        System.out.println(m);
    }

    for(double p : prices){
        System.out.println(p);
    }

    for(int c : capacity){
        System.out.println(c);
    }

    for(int r : rating){
        System.out.println(r);
    }

    for(int w : warranty){
        System.out.println(w);
    }
}

static String[] getFridgeModels(){
    return fridgeModels;
}

static double[] getFridgePrices(){
    return fridgePrices;
}

static int[] getFridgeCapacity(){
    return fridgeCapacity;
}

static int[] getFridgeRating(){
    return fridgeRating;
}

static int[] getFridgeWarranty(){
    return fridgeWarranty;
}

}