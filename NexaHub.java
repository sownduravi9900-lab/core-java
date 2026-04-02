class NexaHub {
    String memberName;
    String platformName;
    String accessType;
    double membershipCost;

    public NexaHub(String memberName, String platformName, String accessType, double membershipCost) {
        this.memberName = memberName;
        this.platformName = platformName;
        this.accessType = accessType;
        this.membershipCost = membershipCost;
        System.out.println("Membership activated successfully on NexaHub");
    }

    public NexaHub(String memberName, String accessType) {
        this.memberName = memberName;
        this.accessType = accessType;
        System.out.println(accessType);
    }

    public NexaHub(String memberName) {
        System.out.println(memberName);
        System.out.println("Welcome to NexaHub!");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}

