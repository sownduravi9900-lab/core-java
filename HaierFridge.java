class HaierFridge {

static String[] fridgeModels = {"HRD195","HRD215","HRB276","HRF298","HRF335","HRD190","HRF438","HRB345"};
static double[] fridgePrices = {19000,21000,30000,33000,38000,17000,42000,36000};
static int[] fridgeCapacity = {195,215,276,298,335,190,438,345};
static int[] fridgeRating = {4,4,4,4,5,3,5,4};
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