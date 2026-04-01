class StudentsIDRunner {
    public static void main(String[] args) {

        StudentsID s1 = new StudentsID();
        s1.studentName = "Sowndarya";
        s1.studentId = 101;
        s1.department = "Computer Science";
        s1.university = "Mandya University";
        s1.email = "ravi@gmail.com";
        s1.phoneNumber = 9876543210L;
        s1.section = 'A';

        StudentsID s2 = new StudentsID();
        s2.studentName = "Anu";
        s2.studentId = 102;
        s2.department = "Electronics";
        s2.university = "Bangalore University";
        s2.email = "anu@gmail.com";
        s2.phoneNumber = 9123456780L;
        s2.section = 'B';

        StudentsID s3 = new StudentsID();
        s3.studentName = "Rahul";
        s3.studentId = 103;
        s3.department = "Mechanical";
        s3.university = "VTU";
        s3.email = "rahul@gmail.com";
        s3.phoneNumber = 9988776655L;
        s3.section = 'A';

        StudentsID s4 = new StudentsID();
        s4.studentName = "Sneha";
        s4.studentId = 104;
        s4.department = "Civil";
        s4.university = "Mysore University";
        s4.email = "sneha@gmail.com";
        s4.phoneNumber = 8877665544L;
        s4.section = 'C';

        StudentsID s5 = new StudentsID();
        s5.studentName = "Kiran";
        s5.studentId = 105;
        s5.department = "Information Science";
        s5.university = "VTU";
        s5.email = "kiran@gmail.com";
        s5.phoneNumber = 7766554433L;
        s5.section = 'B';

        StudentsID s6 = new StudentsID();
        s6.studentName = "Divya";
        s6.studentId = 106;
        s6.department = "Biotechnology";
        s6.university = "Bangalore University";
        s6.email = "divya@gmail.com";
        s6.phoneNumber = 6655443322L;
        s6.section = 'A';

        StudentsID s7 = new StudentsID();
        s7.studentName = "Arjun";
        s7.studentId = 107;
        s7.department = "BCA";
        s7.university = "VTU";
        s7.email = "arjun@gmail.com";
        s7.phoneNumber = 5544332211L;
        s7.section = 'C';

        StudentsID[] list = {s1, s2, s3, s4, s5, s6, s7};

        for (StudentsID s : list) {
            System.out.println("----- Student ID Details -----");
            System.out.println("Name: " + s.studentName);
            System.out.println("ID: " + s.studentId);
            System.out.println("Department: " + s.department);
            System.out.println("University: " + s.university);
            System.out.println("Email: " + s.email);
            System.out.println("Phone: " + s.phoneNumber);
            System.out.println("Section: " + s.section);
        }
    }
}