class SamsungFridge {

static String[] fridgeModels = {"RT28","RT30","RT34","RS72","RR21","RT26","RS64","RT37"};
static double[] fridgePrices = {26000,31000,45000,90000,21000,28000,85000,48000};
static int[] fridgeCapacity = {253,275,345,700,198,244,640,390};
static int[] fridgeRating = {4,4,5,5,3,4,5,4};
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