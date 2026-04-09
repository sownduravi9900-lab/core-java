class RelianceMart {

    void displaySections() {

String[] groceries = new String[16];
groceries[0] = "Atta";
groceries[1] = "Rice";
groceries[2] = "Sugar";
groceries[3] = "Salt";
groceries[4] = "CookingOil";
groceries[5] = "ToorDal";
groceries[6] = "MoongDal";
groceries[7] = "ChanaDal";
groceries[8] = "Besan";
groceries[9] = "Maida";
groceries[10] = "Poha";
groceries[11] = "Rava";
groceries[12] = "CornFlakes";
groceries[13] = "Oats";
groceries[14] = "Vermicelli";
groceries[15] = "Noodles";

String[] dairy = new String[16];
dairy[0] = "FullCreamMilk";
dairy[1] = "TonedMilk";
dairy[2] = "Curd";
dairy[3] = "Butter";
dairy[4] = "Cheese";
dairy[5] = "Paneer";
dairy[6] = "Ghee";
dairy[7] = "FreshCream";
dairy[8] = "Lassi";
dairy[9] = "Buttermilk";
dairy[10] = "MilkPowder";
dairy[11] = "FlavouredMilk";
dairy[12] = "Yogurt";
dairy[13] = "Custard";
dairy[14] = "IceCream";
dairy[15] = "CondensedMilk";

String[] snacks = new String[16];
snacks[0] = "PotatoChips";
snacks[1] = "Nachos";
snacks[2] = "Biscuits";
snacks[3] = "Cookies";
snacks[4] = "Chocolate";
snacks[5] = "Candy";
snacks[6] = "Namkeen";
snacks[7] = "Popcorn";
snacks[8] = "Crackers";
snacks[9] = "DryFruits";
snacks[10] = "EnergyBar";
snacks[11] = "Cupcake";
snacks[12] = "Brownie";
snacks[13] = "Donut";
snacks[14] = "Jelly";
snacks[15] = "Wafers";

String[] household = new String[16];
household[0] = "Bucket";
household[1] = "Mug";
household[2] = "Dustbin";
household[3] = "Broom";
household[4] = "Mop";
household[5] = "CleaningBrush";
household[6] = "Scrubber";
household[7] = "FloorMat";
household[8] = "Curtains";
household[9] = "BedSheet";
household[10] = "Pillow";
household[11] = "Blanket";
household[12] = "Lamp";
household[13] = "WallClock";
household[14] = "Stool";
household[15] = "ClothStand";

String[] personalCare = new String[16];
personalCare[0] = "BathSoap";
personalCare[1] = "Shampoo";
personalCare[2] = "Conditioner";
personalCare[3] = "FaceWash";
personalCare[4] = "Toothpaste";
personalCare[5] = "Toothbrush";
personalCare[6] = "HairOil";
personalCare[7] = "Deodorant";
personalCare[8] = "Perfume";
personalCare[9] = "BodyLotion";
personalCare[10] = "FaceCream";
personalCare[11] = "BodyWash";
personalCare[12] = "HandWash";
personalCare[13] = "Sanitizer";
personalCare[14] = "ShavingCream";
personalCare[15] = "FaceMask";

String[][] sections = {groceries, dairy, snacks, household, personalCare};

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
}class RelianceMart {

    void displaySections() {

String[] groceries = new String[16];
groceries[0] = "Atta";
groceries[1] = "Rice";
groceries[2] = "Sugar";
groceries[3] = "Salt";
groceries[4] = "CookingOil";
groceries[5] = "ToorDal";
groceries[6] = "MoongDal";
groceries[7] = "ChanaDal";
groceries[8] = "Besan";
groceries[9] = "Maida";
groceries[10] = "Poha";
groceries[11] = "Rava";
groceries[12] = "CornFlakes";
groceries[13] = "Oats";
groceries[14] = "Vermicelli";
groceries[15] = "Noodles";

String[] dairy = new String[16];
dairy[0] = "FullCreamMilk";
dairy[1] = "TonedMilk";
dairy[2] = "Curd";
dairy[3] = "Butter";
dairy[4] = "Cheese";
dairy[5] = "Paneer";
dairy[6] = "Ghee";
dairy[7] = "FreshCream";
dairy[8] = "Lassi";
dairy[9] = "Buttermilk";
dairy[10] = "MilkPowder";
dairy[11] = "FlavouredMilk";
dairy[12] = "Yogurt";
dairy[13] = "Custard";
dairy[14] = "IceCream";
dairy[15] = "CondensedMilk";

String[] snacks = new String[16];
snacks[0] = "PotatoChips";
snacks[1] = "Nachos";
snacks[2] = "Biscuits";
snacks[3] = "Cookies";
snacks[4] = "Chocolate";
snacks[5] = "Candy";
snacks[6] = "Namkeen";
snacks[7] = "Popcorn";
snacks[8] = "Crackers";
snacks[9] = "DryFruits";
snacks[10] = "EnergyBar";
snacks[11] = "Cupcake";
snacks[12] = "Brownie";
snacks[13] = "Donut";
snacks[14] = "Jelly";
snacks[15] = "Wafers";

String[] household = new String[16];
household[0] = "Bucket";
household[1] = "Mug";
household[2] = "Dustbin";
household[3] = "Broom";
household[4] = "Mop";
household[5] = "CleaningBrush";
household[6] = "Scrubber";
household[7] = "FloorMat";
household[8] = "Curtains";
household[9] = "BedSheet";
household[10] = "Pillow";
household[11] = "Blanket";
household[12] = "Lamp";
household[13] = "WallClock";
household[14] = "Stool";
household[15] = "ClothStand";

String[] personalCare = new String[16];
personalCare[0] = "BathSoap";
personalCare[1] = "Shampoo";
personalCare[2] = "Conditioner";
personalCare[3] = "FaceWash";
personalCare[4] = "Toothpaste";
personalCare[5] = "Toothbrush";
personalCare[6] = "HairOil";
personalCare[7] = "Deodorant";
personalCare[8] = "Perfume";
personalCare[9] = "BodyLotion";
personalCare[10] = "FaceCream";
personalCare[11] = "BodyWash";
personalCare[12] = "HandWash";
personalCare[13] = "Sanitizer";
personalCare[14] = "ShavingCream";
personalCare[15] = "FaceMask";

String[][] sections = {groceries, dairy, snacks, household, personalCare};

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