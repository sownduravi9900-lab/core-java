class Chart {
    String title;
    String type;
    int dataPoints;
    String color;

    Chart(String title, String type, int dataPoints, String color) {
        title = title;
        type = type;
        dataPoints = dataPoints;
        color = color;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Data Points: " + dataPoints);
        System.out.println("Color: " + color);
        System.out.println("----------------------");
    }
}