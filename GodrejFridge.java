class GodrejFridge {

static String[] fridgeModels = {"RD190","RD210","RD240","RF320","RF350","RD180","RD250","RF410"};
static double[] fridgePrices = {20000,22000,26000,35000,39000,18000,28000,45000};
static int[] fridgeCapacity = {190,210,240,320,350,180,250,410};
static int[] fridgeRating = {4,3,4,4,5,3,4,5};
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