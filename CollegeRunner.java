class CollegeRunner {
    public static void main(String[] args) {

        College c1 = new College("ABC College", "Bangalore");
		c1.displayInfo();
        c1.checkOpen("Monday");
        College.collegeType();
    }
}