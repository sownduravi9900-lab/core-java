class InstagramRunner {
    public static void main(String[] args) {

        Instagram i1 = new Instagram("Ravi_gram", 1200, 300, false);
        Instagram i2 = new Instagram("Anu_style", 2500, 450, true);
        Instagram i3 = new Instagram("Sowndu_diary", 5000, 600, false);
        Instagram i4 = new Instagram("rash_rider", 3200, 400, true);
        Instagram i5 = new Instagram("Fit_life", 4100, 350, false);
        Instagram i6 = new Instagram("Music_vibes", 2800, 500, true);
        Instagram i7 = new Instagram("Study_point", 1900, 200, false);

        i1.display();
        i2.display();
        i3.display();
        i4.display();
        i5.display();
        i6.display();
        i7.display();
    }
}