class LinkedIn {
    String userName;
    String jobTitle;
    String company;
    int connections;
    int endorsements;
    double profileViews;
    boolean isPremium;

    LinkedIn(String userName, String jobTitle, String company,
             int connections, int endorsements, double profileViews, boolean isPremium) {
this.userName = userName;
this.jobTitle = jobTitle;
this.company = company;
this.connections = connections;
this.endorsements = endorsements;
this.profileViews = profileViews;
this.isPremium = isPremium;
    }

    void display() {
        System.out.println(userName);
        System.out.println(jobTitle);
        System.out.println(company);
        System.out.println(connections);
        System.out.println(endorsements);
        System.out.println(profileViews);
        System.out.println(isPremium);
        System.out.println("-------************--------");
    }
}