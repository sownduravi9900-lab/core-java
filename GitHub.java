class GitHub {
    String repoName;
    String owner;
    int stars;
    double version;
    boolean isPrivate;

    GitHub(String repoName, String owner, int stars, double version, boolean isPrivate) {
        repoName = repoName;
        owner = owner;
        stars = stars;
        version = version;
        isPrivate = isPrivate;
    }
    void display() {
        System.out.println("Repo Name: " + repoName);
        System.out.println("Owner: " + owner);
        System.out.println("Stars: " + stars);
        System.out.println("Version: " + version);
        System.out.println("Private Repo: " + isPrivate);
        System.out.println("----------------------");
    }
}