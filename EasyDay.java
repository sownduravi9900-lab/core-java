class EasyDay {

    void displaySections() {

String[] fruits = new String[16];
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
  fruits[10] = "Kiwi";
 fruits[11] = "Cherry";
 fruits[12] = "Pear";
 fruits[13] = "Plum";
 fruits[14] = "Litchi";
 fruits[15] = "Pomegranate";

String[] vegetables = new String[16];
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
vegetables[10] = "Radish";
vegetables[11] = "Beetroot";
vegetables[12] = "Capsicum";
vegetables[13] = "Pumpkin";
vegetables[14] = "Cucumber";
vegetables[15] = "LadyFinger";

String[] pulses = new String[16];
  pulses[0] = "ToorDal";
pulses[1] = "MoongDal";
 pulses[2] = "ChanaDal";
 pulses[4] = "MasoorDal";
 pulses[5] = "Rajma";
 pulses[6] = "Chickpeas";
 pulses[7] = "BlackBeans";
  pulses[8] = "GreenGram";
 pulses[9] = "HorseGram";
 pulses[10] = "Lentils";
  pulses[11] = "PeasDal";
  pulses[12] = "SplitDal";
  pulses[13] = "WholeDal";
 pulses[14] = "Soybeans";
  pulses[15] = "KidneyBeans";

String[] beverages = new String[16];
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
beverages[10] = "IcedTea";
beverages[11] = "Smoothie";
 beverages[12] = "ProteinShake";
   beverages[13] = "CoconutWater";
  beverages[14] = "ButterMilk";
 beverages[15] = "SoftDrink";

String[] cleaning = new String[16];
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
cleaning[10] = "Scrubber";
cleaning[11] = "LiquidSoap";
cleaning[12] = "Phenyl";
cleaning[13] = "Bleach";
cleaning[14] = "AirFreshener";
cleaning[15] = "Wipes";

String[][] sections = {fruits, vegetables, pulses, beverages, cleaning};

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
