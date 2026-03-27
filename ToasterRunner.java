class ToasterRunner {

public static void main(String[] args) {

// check toaster status
Toaster.checkToasterStatus();
// turn on toaster
Toaster.turnOnToaster();
// check again
Toaster.checkToasterStatus();

// display toast level
int level = Toaster.getToastLevel();
System.out.println("Toast Level is : " + level);
}
}