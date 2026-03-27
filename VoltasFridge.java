class VoltasFridge {

static String[] fridgeModels = {"VDF201","VDF231","VDF261","VDF301","VDF341","VDF381","VDF421","VDF461"};
static double[] fridgePrices = {18000,20000,23000,26000,29000,32000,35000,38000};
static int[] fridgeCapacity = {190,230,260,300,340,380,420,460};
static int[] fridgeRating = {3,4,4,4,4,5,4,5};
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