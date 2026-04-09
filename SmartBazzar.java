class SmartBazzar {

    void displaySections() {

String[] fruits = new String[10];
fruits[0] = "Apple";
fruits[1] = "Banana";
fruits[2] = "Mango";
fruits[3] = "Orange";
fruits[4] = "Grapes";
fruits[5] = "Pineapple";
fruits[6] = "Papaya";
fruits[7] = "Guava";
fruits[8] = "Watermelon";
fruits[9] = "Strawberry";

String[] vegetables = new String[10];
vegetables[0] = "Tomato";
vegetables[1] = "Potato";
vegetables[2] = "Onion";
vegetables[3] = "Carrot";
vegetables[4] = "Cabbage";
vegetables[5] = "Cauliflower";
vegetables[6] = "Brinjal";
vegetables[7] = "Beans";
vegetables[8] = "Peas";
vegetables[9] = "Spinach";

String[] bakery = new String[10];
bakery[0] = "Bread";
bakery[1] = "Bun";
bakery[2] = "Croissant";
bakery[3] = "Muffin";
bakery[4] = "Pastry";
bakery[5] = "Bagel";
bakery[6] = "Roll";
bakery[7] = "PizzaBase";
bakery[8] = "GarlicBread";
bakery[9] = "CupCake";

String[] beverages = new String[10];
beverages[0] = "Tea";
beverages[1] = "Coffee";
beverages[2] = "GreenTea";
beverages[3] = "BlackTea";
beverages[4] = "Juice";
beverages[5] = "MilkShake";
beverages[6] = "ColdCoffee";
beverages[7] = "Soda";
beverages[8] = "EnergyDrink";
beverages[9] = "Lemonade";

String[] cleaning = new String[10];
cleaning[0] = "Detergent";
cleaning[1] = "FloorCleaner";
cleaning[2] = "DishWash";
cleaning[3] = "ToiletCleaner";
cleaning[4] = "GlassCleaner";
cleaning[5] = "Brush";
cleaning[6] = "Mop";
cleaning[7] = "Broom";
cleaning[8] = "DustPan";
cleaning[9] = "CleaningCloth";

String[][] sections = {fruits, vegetables, bakery, beverages, cleaning};

System.out.println("---- FOR LOOP ----");
  for (int i = 0; i < sections.length; i++) {
     System.out.println("Section " + i);
          for (int j = 0; j < sections[i].length; j++) {
              System.out.println("Index value : " + j);
             System.out.println(sections[i][j]);
}
}
System.out.println("---- FOR EACH LOOP ----");
int sec = 0;
    for (String[] section : sections) {
       System.out.println("Section " + sec);
        int index = 0;
           for (String product : section) {
             System.out.println("Index value : " + index);
             System.out.println(product);
             index++;
}
sec++;
}
}
}