class Bangles {

    String getStatus() {
        String status = "Shiny";
        System.out.println("Status is: " + status);
        return status;
    }

    void wearBangles() {
        System.out.println("Bangles are being worn...");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
    }

    void setColor(String color) {
        System.out.println("Color is: " + color);
        wearBangles();
    }
}

class BanglesRunner {

    public static void main(String[] args) {
        Bangles bangles = new Bangles();
        bangles.setColor("Gold");
    }
}