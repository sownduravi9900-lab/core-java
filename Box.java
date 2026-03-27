class Box {

    // 3 static variables 
    static int length = 10;
    static int width = 5;
    static int height = 8;

    public static void main(String[] args) {

        // 3 local variables
        int volume;
        String boxType;
        double weight;

        volume = length * width * height;
        boxType = "Cardboard";
        weight = 2.5;

        System.out.println("Box Type   : " + boxType);
        System.out.println("Volume     : " + volume);
        System.out.println("Weight (kg): " + weight);
    }
}