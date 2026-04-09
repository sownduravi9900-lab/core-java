class MetroMart {

    void displaySections() {

String[] electronics = new String[16];
electronics[0] = "Television";
electronics[1] = "Smartphone";
electronics[2] = "Laptop";
electronics[3] = "Tablet";
electronics[4] = "SmartWatch";
electronics[5] = "Headphones";
electronics[6] = "BluetoothSpeaker";
electronics[7] = "Camera";
electronics[8] = "Printer";
electronics[9] = "Scanner";
electronics[10] = "Router";
electronics[11] = "Projector";
electronics[12] = "PowerBank";
electronics[13] = "Charger";
electronics[14] = "USBDrive";
electronics[15] = "HardDisk";

String[] furniture = new String[16];
furniture[0] = "Sofa";
furniture[1] = "Chair";
furniture[2] = "Table";
furniture[3] = "Bed";
furniture[4] = "Wardrobe";
furniture[5] = "Cupboard";
furniture[6] = "DiningTable";
furniture[7] = "StudyTable";
furniture[8] = "OfficeChair";
furniture[9] = "Bookshelf";
furniture[10] = "TVUnit";
furniture[11] = "ShoeRack";
furniture[12] = "Stool";
furniture[13] = "Bench";
furniture[14] = "Recliner";
furniture[15] = "DressingTable";

String[] sports = new String[16];
sports[0] = "CricketBat";
sports[1] = "CricketBall";
sports[2] = "Football";
sports[3] = "Basketball";
sports[4] = "TennisRacket";
sports[5] = "BadmintonRacket";
sports[6] = "ShuttleCock";
sports[7] = "SkippingRope";
sports[8] = "Dumbbells";
sports[9] = "YogaMat";
sports[10] = "Treadmill";
sports[11] = "ExerciseCycle";
sports[12] = "Gloves";
sports[13] = "Helmet";
sports[14] = "KneePad";
sports[15] = "ElbowGuard";

String[] books = new String[16];
books[0] = "StoryBook";
books[1] = "Novel";
books[2] = "Comics";
books[3] = "Magazine";
books[4] = "Dictionary";
books[5] = "Atlas";
books[6] = "ScienceBook";
books[7] = "MathBook";
books[8] = "HistoryBook";
books[9] = "GeographyBook";
books[10] = "Biography";
books[11] = "Autobiography";
books[12] = "PoetryBook";
books[13] = "CookBook";
books[14] = "TravelGuide";
books[15] = "PuzzleBook";

String[] beauty = new String[16];
beauty[0] = "Lipstick";
beauty[1] = "Foundation";
beauty[2] = "Compact";
beauty[3] = "Kajal";
beauty[4] = "Eyeliner";
beauty[5] = "Mascara";
beauty[6] = "Blush";
beauty[7] = "NailPolish";
beauty[8] = "FacePowder";
beauty[9] = "MakeupKit";
beauty[10] = "Primer";
beauty[11] = "Concealer";
beauty[12] = "Highlighter";
beauty[13] = "MakeupBrush";
beauty[14] = "HairSerum";
beauty[15] = "FaceMask";

String[][] sections = {electronics, furniture, sports, books, beauty};

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