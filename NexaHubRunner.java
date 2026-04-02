class NexaHubRunner {

    public static void main(String[] args) {

        System.out.println("Join NexaHub platform");

        NexaHub user1 = new NexaHub("Sowndarya","Learning Platform","Gold Access",799.00);

        System.out.println("Check membership");

        NexaHub check = new NexaHub("Sowndarya", "Gold Access");
		
        NexaHub profile = new NexaHub("Sowndarya");
    }
}