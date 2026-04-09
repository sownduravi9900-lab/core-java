class Zudio {

    void displaySections() {

String[] mensWear = new String[16];
mensWear[0] = "Shirt";
mensWear[1] = "TShirt";
mensWear[2] = "Jeans";
mensWear[3] = "Trouser";
mensWear[4] = "Jacket";
mensWear[5] = "Blazer";
mensWear[6] = "Hoodie";
mensWear[7] = "Shorts";
mensWear[8] = "Sweater";
mensWear[9] = "Kurta";
mensWear[10] = "TrackPant";
mensWear[11] = "InnerWear";
mensWear[12] = "Coat";
mensWear[13] = "Raincoat";
mensWear[14] = "Vest";
mensWear[15] = "CargoPant";

String[] womensWear = new String[16];
womensWear[0] = "Saree";
womensWear[1] = "Kurti";
womensWear[2] = "Top";
womensWear[3] = "Leggings";
womensWear[4] = "Skirt";
womensWear[5] = "Gown";
womensWear[6] = "Dress";
womensWear[7] = "Palazzo";
womensWear[8] = "Dupatta";
womensWear[9] = "Blouse";
womensWear[10] = "Jeans";
womensWear[11] = "TShirt";
womensWear[12] = "NightWear";
womensWear[13] = "Shrug";
womensWear[14] = "Jumpsuit";
womensWear[15] = "Cardigan";

String[] kidsWear = new String[16];
kidsWear[0] = "KidsTShirt";
kidsWear[1] = "KidsJeans";
kidsWear[2] = "KidsFrock";
kidsWear[3] = "KidsShorts";
kidsWear[4] = "KidsShirt";
kidsWear[5] = "KidsDress";
kidsWear[6] = "KidsHoodie";
kidsWear[7] = "KidsJacket";
kidsWear[8] = "KidsSweater";
kidsWear[9] = "KidsNightSuit";
kidsWear[10] = "KidsTrackPant";
kidsWear[11] = "KidsTop";
kidsWear[12] = "KidsLeggings";
kidsWear[13] = "KidsCap";
kidsWear[14] = "KidsSocks";
kidsWear[15] = "KidsInnerWear";

String[] footwear = new String[16];
footwear[0] = "Shoes";
footwear[1] = "Sandals";
footwear[2] = "Slippers";
footwear[3] = "Sneakers";
footwear[4] = "Boots";
footwear[5] = "Heels";
footwear[6] = "Flats";
footwear[7] = "Loafers";
footwear[8] = "FlipFlops";
footwear[9] = "SportsShoes";
footwear[10] = "CasualShoes";
footwear[11] = "FormalShoes";
footwear[12] = "RunningShoes";
footwear[13] = "CanvasShoes";
footwear[14] = "Wedges";
footwear[15] = "EthnicFootwear";

String[] accessories = new String[16];
accessories[0] = "Watch";
accessories[1] = "Belt";
accessories[2] = "Wallet";
accessories[3] = "Handbag";
accessories[4] = "Backpack";
accessories[5] = "Cap";
accessories[6] = "Sunglasses";
accessories[7] = "Scarf";
accessories[8] = "Gloves";
accessories[9] = "Jewellery";
accessories[10] = "Earrings";
accessories[11] = "Necklace";
accessories[12] = "Bracelet";
accessories[13] = "Ring";
accessories[14] = "HairBand";
accessories[15] = "Clutch";

String[][] sections = {mensWear, womensWear, kidsWear, footwear, accessories};

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