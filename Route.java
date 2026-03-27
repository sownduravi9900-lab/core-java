class Route {

    
    byte routeId;            
    short totalStops;      
    int distance;            
    long routeNumber;        
    float travelTime;        
    double fare;             
    char routeType;          
    boolean isActive;        

    public static void main(String[] args) {

        Route r = new Route();

        r.routeId = 1;
        r.totalStops = 12;
        r.distance = 350;
        r.routeNumber = 20260321L;
        r.travelTime = 6.5f;
        r.fare = 1250.75;
        r.routeType = 'L';     
        r.isActive = true;

        System.out.println("Route ID: " + r.routeId);
        System.out.println("Total Stops: " + r.totalStops);
        System.out.println("Distance: " + r.distance + " km");
        System.out.println("Route Number: " + r.routeNumber);
        System.out.println("Travel Time: " + r.travelTime + " hrs");
        System.out.println("Fare: " + r.fare);
        System.out.println("Route Type: " + r.routeType);
        System.out.println("Route Active: " + r.isActive);
    }
}