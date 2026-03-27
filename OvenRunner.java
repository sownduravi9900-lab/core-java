class OvenRunner {
public static void main(String[] args) {

    // check oven status
Oven.checkOvenStatus();

    // turn on oven
Oven.turnOnOven();

    // check again
Oven.checkOvenStatus();

        
    // display cooking time
int time = Oven.getCookingTime();
System.out.println("Cooking Time is : " + time + " minutes");

}
}