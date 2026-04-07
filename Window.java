class Window {
  String getStatus() {
  String status = "Open";
  System.out.println("Status is: " + status);
return status;
}

    void openWindow() {
System.out.println("Window is opening");
String s = getStatus();
System.out.println("Returned Status: " + s);
}

void setMaterial(String material) {
System.out.println("Material is: " + material);
openWindow();
}
}