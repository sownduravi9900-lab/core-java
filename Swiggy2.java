class Swiggy2{

  static int checkItem(String foodItem){
	  int price = 0;
	  
	  if("R M Briyani" == foodItem){
		  System.out.println("food item is :" + foodItem);
		  price = 250;
		  return price;
	  }else if("Fried rice" == foodItem){
		  System.out.println("food item is :" + foodItem);
		  price = 350;
		  return price;
	  }else if("Chicken kabab" == foodItem){
		  System.out.println("food item is :" + foodItem);
		  price = 450;
	  }else{
		  System.out.println("No item found");
		  return 0;
	  }
  }
  
  static void checkItem(String foodItem, int price,int noItem){
    int totalPrice =0;
	if("R M Biriyani" = foodItem){
		price = totalPricerice * noItems;
		return totalPrice;
	}else if ("Chicken kabab" == foodItem){
		totalPrice = price * noItem;
		return totalPrice;
	}else if ("fride rice" == foodItem){
		totalPrice = price * noItem;
		return totalPrice;
	}else{
		return 0;
	}
  }
  
  

}