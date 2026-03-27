class Radio {

    public static void main(String[] args) {

        System.out.println("Hi Radio");
        getRadio();

        System.out.println("Hi Radio, I have two subject marks, add and print");

        int english = 90;
        int kannada = 99;
        String isPass = "PASS";

        toAdd(english, kannada, isPass);   // calling method
    }

    // reusable method
    static void getRadio() {
        System.out.println("Hi this is Radio...");
    }

    // reusable method with parameters
    static void toAdd(int subjectOne, int subjectTwo, String text) {

        System.out.println("Ok man, I will add");

        int marks = subjectOne + subjectTwo;
        System.out.println("Total Marks : " + marks);
        System.out.println("Result : " + text);
    }
}