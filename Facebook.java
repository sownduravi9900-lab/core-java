class Facebook {
    String userName;
    int followers;
    int posts;
    boolean isVerified;

   
    Facebook(String userName, int followers, int posts, boolean isVerified) {
        this.userName = userName;
        this.followers = followers;
        this.posts = posts;
        this.isVerified = isVerified;
    }

    
    void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Followers: " + followers);
        System.out.println("Posts: " + posts);
        System.out.println("Verified: " + isVerified);
        System.out.println("----------------------");
    }
}