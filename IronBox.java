class IronBox {
    String getStatus(){
    String status = "Heated";
    System.out.println("Status is: " + status);
    return status;
}

    void startIron(){
        System.out.println("Iron is starting");
        String s = getStatus();
        System.out.println("Returned Status: " + s);
}

    void setBrand(String brand){
        System.out.println("Brand is: " + brand);
        startIron();
}
}