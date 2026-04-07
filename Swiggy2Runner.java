class Swiggy2Runner{

  public static void main(String[] args){
	    int price = 0;
	  price = Swiggy2.checkItem("R M Biriyani");
	  System.out.println("for one plate :"+ price);
	  
	  int totalPrice = Swiggy2.checkItem("Fried Rice",price,10);
     Sytem.out.println("totalPrice :" + totalPrice);
  }

}