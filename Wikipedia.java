class Wikipedia {
    String articleTitle;
    String language;
    int wordCount;
    double rating;
    boolean isFeatured;
    char categoryCode;
    long views;

    Wikipedia(String articleTitle, String language, int wordCount, double rating,
              boolean isFeatured, char categoryCode, long views) {
        this.articleTitle = articleTitle;
        this.language = language;
        this.wordCount = wordCount;
        this.rating = rating;
        this.isFeatured = isFeatured;
        this.categoryCode = categoryCode;
        this.views = views;
    }

    void display() {
        System.out.println(articleTitle);
        System.out.println(language);
        System.out.println(wordCount);
        System.out.println(rating);
        System.out.println(isFeatured);
        System.out.println(categoryCode);
        System.out.println(views);
        System.out.println("##################################");
    }
}