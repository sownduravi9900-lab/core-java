class Chart {
    String title;
    String type;
    int dataPoints;
    String color;

    Chart(String title, String type, int dataPoints, String color) {
        this.title = title;
        this.type = type;
        this.dataPoints = dataPoints;
        this.color = color;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Data Points: " + dataPoints);
        System.out.println("Color: " + color);
        System.out.println("----------------------");
    }
}