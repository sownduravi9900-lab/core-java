class SpecksRunner {

   public static void main(String[] args) {

    Specks s1 = new Specks();

    s1.brandName = "RayBan";
    s1.modelName = "RB3025";
    s1.color = "Black";
    s1.id = 101;
    s1.ownerName = "John";
    s1.isAvailable = true;
    s1.price = 5500;

    Specks s2 = new Specks();

    s2.brandName = "Oakley";
    s2.modelName = "OX8046";
    s2.color = "Brown";
    s2.id = 102;
    s2.ownerName = "Ravi";
    s2.isAvailable = false;
    s2.price = 6200;

    Specks s3 = new Specks();

    s3.brandName = "Fastrack";
    s3.modelName = "FT123";
    s3.color = "Blue";
    s3.id = 103;
    s3.ownerName = "Vidhya";
    s3.isAvailable = true;
    s3.price = 2500;

    Specks s4 = new Specks();

    s4.brandName = "Titan";
    s4.modelName = "TT567";
    s4.color = "Grey";
    s4.id = 104;
    s4.ownerName = "Sowndu";
    s4.isAvailable = false;
    s4.price = 3000;

    System.out.println(" ** printing the statement**");
    System.out.println("s1 brandName: " + s1.brandName);
    System.out.println("s1 modelName: " + s1.modelName);
    System.out.println("s1 color: " + s1.color);
    System.out.println("s1 id: " + s1.id);
    System.out.println("s1 ownerName: " + s1.ownerName);
    System.out.println("s1 isAvailable: " + s1.isAvailable);
    System.out.println("s1 price: " + s1.price);

    System.out.println(" ** printing the statement**");
    System.out.println("s2 brandName: " + s2.brandName);
    System.out.println("s2 modelName: " + s2.modelName);
    System.out.println("s2 color: " + s2.color);
    System.out.println("s2 id: " + s2.id);
    System.out.println("s2 ownerName: " + s2.ownerName);
    System.out.println("s2 isAvailable: " + s2.isAvailable);
    System.out.println("s2 price: " + s2.price);

    System.out.println(" ** printing the statement**");
    System.out.println("s3 brandName: " + s3.brandName);
    System.out.println("s3 modelName: " + s3.modelName);
    System.out.println("s3 color: " + s3.color);
    System.out.println("s3 id: " + s3.id);
    System.out.println("s3 ownerName: " + s3.ownerName);
    System.out.println("s3 isAvailable: " + s3.isAvailable);
    System.out.println("s3 price: " + s3.price);

    System.out.println(" ** printing the statement**");
    System.out.println("s4 brandName: " + s4.brandName);
    System.out.println("s4 modelName: " + s4.modelName);
    System.out.println("s4 color: " + s4.color);
    System.out.println("s4 id: " + s4.id);
    System.out.println("s4 ownerName: " + s4.ownerName);
    System.out.println("s4 isAvailable: " + s4.isAvailable);
    System.out.println("s4 price: " + s4.price);
   }
}