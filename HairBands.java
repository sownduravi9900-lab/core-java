class HairBands {
    String material;
    String style;
    int stretchLevel;
    boolean isElastic;

    HairBands(String material, String style, int stretchLevel, boolean isElastic) {
        this.material = material;
        this.style = style;
        this.stretchLevel = stretchLevel;
        this.isElastic = isElastic;
    }


    void display() {
        System.out.println("Material: " + material);
        System.out.println("Style: " + style);
        System.out.println("Stretch Level: " + stretchLevel);
        System.out.println("Is Elastic: " + isElastic);
        System.out.println("----------------------");
    }
}