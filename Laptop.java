class Laptop {
 String getStatus() {
  String status = "Working";
   System.out.println("Status is: " + status);
   return status;
}

   void startLaptop() {
      System.out.println("Laptop is starting");
      String s = getStatus();
     System.out.println("Returned Status: " + s);
    }

  void setBrand(String brand) {
      System.out.println("Brand is: " + brand);
    startLaptop();
a}
}