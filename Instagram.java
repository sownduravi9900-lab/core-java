class Instagram {
    String userName;
    int followers;
    int following;
    boolean isPrivate;
Instagram(String userName, int followers, int following, boolean isPrivate) {
        userName = userName;
        followers = followers;
        following = following;
        isPrivate = isPrivate;
    }
    void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Followers: " + followers);
        System.out.println("Following: " + following);
        System.out.println("Private Account: " + isPrivate);
        System.out.println("----------------------");
    }
}