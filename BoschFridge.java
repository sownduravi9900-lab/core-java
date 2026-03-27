class BoschFridge {

static String[] fridgeModels = {"KGN36","KGN56","KDN30","KDN42","KGN76","KDN45","KGN48","KDN60"};
static double[] fridgePrices = {55000,62000,40000,45000,70000,48000,60000,75000};
static int[] fridgeCapacity = {324,505,288,350,600,380,450,620};
static int[] fridgeRating = {5,5,4,4,5,4,5,5};
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