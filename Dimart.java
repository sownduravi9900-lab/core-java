class Dimart {

    void displaySections() {

String[] groceries = new String[10];
groceries[0] = "Maize";
groceries[1] = "Barley";
groceries[2] = "Jaggery";
groceries[3] = "RockSalt";
groceries[4] = "SunflowerOil";
groceries[5] = "ChanaDal";
groceries[6] = "GreenTea";
groceries[7] = "BlackCoffee";
groceries[8] = "Pepper";
groceries[9] = "Besan";        

 String[] electronics = new String[10];
 electronics[0] = "WashingMachine";
 electronics[1] = "Tablet";
 electronics[2] = "Desktop";
 electronics[3] = "Cooler";
 electronics[4] = "Heater";
 electronics[5] = "Microwave";
 electronics[6] = "Mixer";
 electronics[7] = "Router";
 electronics[8] = "Projector";
 electronics[9] = "SmartWatch";

String[] clothes = new String[10];
clothes[0] = "Blazer";
clothes[1] = "Hoodie";
clothes[2] = "TrackPant";
clothes[3] = "Leggings";
clothes[4] = "Dungaree";
clothes[5] = "Palazzo";
clothes[6] = "Dupatta";
clothes[7] = "NightSuit";
clothes[8] = "InnerWear";
clothes[9] = "Raincoat";

String[] home = new String[10];
home[0] = "Cupboard";
home[1] = "DiningTable";
home[2] = "Wardrobe";
home[3] = "Blanket";
home[4] = "Bedsheet";
home[5] = "WallClock";
home[6] = "Dustbin";
home[7] = "Stool";
home[8] = "Carpet";
home[9] = "Lamp";

String[] snacks = new String[10];
snacks[0] = "Nachos";
snacks[1] = "Brownie";
snacks[2] = "Cupcake";
snacks[3] = "Sandwich";
snacks[4] = "Burger";
snacks[5] = "Pizza";
snacks[6] = "FrenchFries";
snacks[7] = "Donut";
snacks[8] = "Milkshake";
snacks[9] = "IceCream";

String[][] sections = {groceries, electronics, clothes, home, snacks};
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