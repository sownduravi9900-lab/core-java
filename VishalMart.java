class VishalMart {

void displaySections() {

String[] dairy = {"Milk","Curd","Butter","Cheese","Paneer",
            "Ghee","Cream","Lassi","Buttermilk","MilkPowder",
            "FlavouredMilk","Yogurt","CondensedMilk","Custard","IceCream"
};
String[] personalCare = {"Soap","Shampoo","Conditioner","FaceWash","Toothpaste",
            "Toothbrush","HairOil","Perfume","Deodorant","Lotion",
            "FaceCream","BodyWash","HandWash","Sanitizer","TalcumPowder"
};

String[] stationery = {"Pen","Pencil","Eraser","Sharpener","Notebook",
            "Diary","Marker","Highlighter","Stapler","Glue",
            "Tape","Scale","File","Folder","Calculator"
};
String[] kitchen = {"Plate","Spoon","Fork","Knife","Pan",
            "Cooker","Bottle","LunchBox","Tiffin","Container",
            "Mixer","Grinder","ChoppingBoard","GasStove","Kettle"
};
String[] toys = {"CarToy","Doll","Puzzle","BoardGame","Ball",
            "TeddyBear","BuildingBlocks","RemoteCar","ActionFigure","YoYo",
            "DroneToy","RobotToy","TrainSet","HelicopterToy","RubikCube"
};
String[][] sections = {dairy, personalCare, stationery, kitchen, toys};
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