class Trends {

    void displaySections() {

String[] mensWear = new String[16];
mensWear[0] = "OversizedTShirt";
mensWear[1] = "BaggyJeans";
mensWear[2] = "CargoPants";
mensWear[3] = "Hoodie";
mensWear[4] = "DenimJacket";
mensWear[5] = "CoOrdSet";
mensWear[6] = "TrackPant";
mensWear[7] = "PoloTShirt";
mensWear[8] = "CasualShirt";
mensWear[9] = "FormalShirt";
mensWear[10] = "Blazer";
mensWear[11] = "Sweatshirt";
mensWear[12] = "Joggers";
mensWear[13] = "Kurta";
mensWear[14] = "Shorts";
mensWear[15] = "LinenShirt";

String[] womensWear = new String[16];
womensWear[0] = "KurtiSet";
womensWear[1] = "CoOrdSet";
womensWear[2] = "MaxiDress";
womensWear[3] = "BodyconDress";
womensWear[4] = "Top";
womensWear[5] = "Jeans";
womensWear[6] = "Palazzo";
womensWear[7] = "Skirt";
womensWear[8] = "Saree";
womensWear[9] = "Gown";
womensWear[10] = "Jumpsuit";
womensWear[11] = "Shrug";
womensWear[12] = "CropTop";
womensWear[13] = "Leggings";
womensWear[14] = "NightWear";
womensWear[15] = "EthnicDress";

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
kidsWear[15] = "KidsShoes";

String[] footwear = new String[16];
footwear[0] = "Sneakers";
footwear[1] = "CasualShoes";
footwear[2] = "FormalShoes";
footwear[3] = "SportsShoes";
footwear[4] = "RunningShoes";
footwear[5] = "Sandals";
footwear[6] = "Slippers";
footwear[7] = "FlipFlops";
footwear[8] = "Boots";
footwear[9] = "Heels";
footwear[10] = "Flats";
footwear[11] = "Loafers";
footwear[12] = "CanvasShoes";
footwear[13] = "Wedges";
footwear[14] = "EthnicFootwear";
footwear[15] = "PartyShoes";

String[] accessories = new String[16];
accessories[0] = "SmartWatch";
accessories[1] = "Watch";
accessories[2] = "Belt";
accessories[3] = "Wallet";
accessories[4] = "Handbag";
accessories[5] = "Backpack";
accessories[6] = "Cap";
accessories[7] = "Sunglasses";
accessories[8] = "Scarf";
accessories[9] = "Gloves";
accessories[10] = "Jewellery";
accessories[11] = "Earrings";
accessories[12] = "Necklace";
accessories[13] = "Bracelet";
accessories[14] = "Ring";
accessories[15] = "HairBand";

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