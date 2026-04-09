class MoreMore {

    void displaySections() {

String[] bakery = new String[16];
bakery[0] = "WhiteBread";
bakery[1] = "BrownBread";
bakery[2] = "Bun";
bakery[3] = "Croissant";
bakery[4] = "Muffin";
bakery[5] = "Cake";
bakery[6] = "Pastry";
bakery[7] = "Donut";
bakery[8] = "Brownie";
bakery[9] = "Toast";
bakery[10] = "Rusk";
bakery[11] = "Puff";
bakery[12] = "Pie";
bakery[13] = "Tart";
bakery[14] = "SwissRoll";
bakery[15] = "BreadStick";

String[] frozen = new String[16];
frozen[0] = "FrozenPeas";
frozen[1] = "FrozenCorn";
frozen[2] = "FrozenPizza";
frozen[3] = "FrozenFries";
frozen[4] = "FrozenNuggets";
frozen[5] = "FrozenParatha";
frozen[6] = "FrozenPaneer";
frozen[7] = "FrozenBerries";
frozen[8] = "FrozenVegMix";
frozen[9] = "FrozenChicken";
frozen[10] = "FrozenFish";
frozen[11] = "FrozenDessert";
frozen[12] = "FrozenIceCream";
frozen[13] = "FrozenSpringRoll";
frozen[14] = "FrozenCutlet";
frozen[15] = "FrozenSamosa";

String[] beverages = new String[16];
beverages[0] = "MineralWater";
beverages[1] = "SparklingWater";
beverages[2] = "Cola";
beverages[3] = "OrangeJuice";
beverages[4] = "AppleJuice";
beverages[5] = "MangoJuice";
beverages[6] = "EnergyDrink";
beverages[7] = "SportsDrink";
beverages[8] = "IcedCoffee";
beverages[9] = "ColdTea";
beverages[10] = "LemonJuice";
beverages[11] = "FruitPunch";
beverages[12] = "HerbalDrink";
beverages[13] = "MilkShake";
beverages[14] = "ProteinShake";
beverages[15] = "SoftDrink";

String[] homeCare = new String[16];
homeCare[0] = "FloorCleaner";
homeCare[1] = "ToiletCleaner";
homeCare[2] = "GlassCleaner";
homeCare[3] = "DishLiquid";
homeCare[4] = "DetergentPowder";
homeCare[5] = "DetergentLiquid";
homeCare[6] = "FabricSoftener";
homeCare[7] = "AirFreshener";
homeCare[8] = "RoomSpray";
homeCare[9] = "Phenyl";
homeCare[10] = "Bleach";
homeCare[11] = "CleaningBrush";
homeCare[12] = "Scrubber";
homeCare[13] = "DustbinBag";
homeCare[14] = "Wipes";
homeCare[15] = "Disinfectant";

String[] petCare = new String[16];
petCare[0] = "DogFood";
petCare[1] = "CatFood";
petCare[2] = "PetShampoo";
petCare[3] = "PetSoap";
petCare[4] = "DogBiscuit";
petCare[5] = "CatTreat";
petCare[6] = "PetToy";
petCare[7] = "PetBowl";
petCare[8] = "PetBed";
petCare[9] = "PetLeash";
petCare[10] = "PetCollar";
petCare[11] = "PetBrush";
petCare[12] = "PetSpray";
petCare[13] = "PetWipes";
petCare[14] = "PetCarrier";
petCare[15] = "PetMat";

String[][] sections = {bakery, frozen, beverages, homeCare, petCare};

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