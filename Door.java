class Door {
    String getStatus() {
      String status = "Closed";
      System.out.println("Status is: " + status);
          return status;
}

  void openDoor() {
        System.out.println("Door is opening");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
}

  void setMaterial(String material) {
        System.out.println("Material is: " + material);
        openDoor();
}
}