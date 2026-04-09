class MeghaMart {

    void displaySections() {

String[] groceries = new String[16];
groceries[0] = "Rice";
groceries[1] = "Wheat";
groceries[2] = "Sugar";
groceries[3] = "Salt";
groceries[4] = "Oil";
groceries[5] = "Dal";
groceries[6] = "Tea";
groceries[7] = "Coffee";
groceries[8] = "Spices";
groceries[9] = "Flour";
groceries[10] = "Rava";
groceries[11] = "Poha";
groceries[12] = "Maida";
groceries[13] = "CornFlour";
groceries[14] = "Oats";
groceries[15] = "Noodles";

String[] dairy = new String[16];
dairy[0] = "Milk";
dairy[1] = "Curd";
dairy[2] = "Butter";
dairy[3] = "Cheese";
dairy[4] = "Paneer";
dairy[5] = "Ghee";
dairy[6] = "Cream";
dairy[7] = "Lassi";
dairy[8] = "Buttermilk";
dairy[9] = "MilkPowder";
dairy[10] = "Yogurt";
dairy[11] = "Custard";
dairy[12] = "IceCream";
dairy[13] = "CondensedMilk";
dairy[14] = "FlavouredMilk";
dairy[15] = "Khoa";

String[] snacks = new String[16];
snacks[0] = "Chips";
snacks[1] = "Biscuits";
snacks[2] = "Chocolate";
snacks[3] = "Cookies";
snacks[4] = "Namkeen";
snacks[5] = "Popcorn";
snacks[6] = "Wafers";
snacks[7] = "Crackers";
snacks[8] = "DryFruits";
snacks[9] = "EnergyBar";
snacks[10] = "Nachos";
snacks[11] = "Cupcake";
snacks[12] = "Brownie";
snacks[13] = "Donut";
snacks[14] = "Candy";
snacks[15] = "Jelly";

String[] household = new String[16];
household[0] = "Bucket";
household[1] = "Mug";
household[2] = "Chair";
household[3] = "Table";
household[4] = "Sofa";
household[5] = "Bed";
household[6] = "Pillow";
household[7] = "Curtains";
household[8] = "Mat";
household[9] = "Mirror";
household[10] = "Clock";
household[11] = "Lamp";
household[12] = "Dustbin";
household[13] = "Stool";
household[14] = "Carpet";
household[15] = "Wardrobe";

String[] personalCare = new String[16];
personalCare[0] = "Soap";
personalCare[1] = "Shampoo";
personalCare[2] = "Conditioner";
personalCare[3] = "FaceWash";
personalCare[4] = "Toothpaste";
personalCare[5] = "Toothbrush";
personalCare[6] = "HairOil";
personalCare[7] = "Perfume";
personalCare[8] = "Deodorant";
personalCare[9] = "Lotion";
personalCare[10] = "FaceCream";
personalCare[11] = "BodyWash";
personalCare[12] = "HandWash";
personalCare[13] = "Sanitizer";
personalCare[14] = "TalcumPowder";
personalCare[15] = "ShavingCream";

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