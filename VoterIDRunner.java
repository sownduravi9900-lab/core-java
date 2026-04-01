class VoterIDRunner {
    public static void main(String[] args) {

        VoterID v1 = new VoterID();
        v1.name = "Ravi";
        v1.voterIdNumber = 1111111111L;
        v1.dob = "01-01-2000";
        v1.fatherName = "Suresh";
        v1.address = "Mysore";
        v1.gender = 'M';
        v1.constituency = "Mysore East";

        VoterID v2 = new VoterID();
        v2.name = "Anu";
        v2.voterIdNumber = 2222222222L;
        v2.dob = "15-08-1998";
        v2.fatherName = "Ramesh";
        v2.address = "Mandya";
        v2.gender = 'F';
        v2.constituency = "Mandya South";

        VoterID v3 = new VoterID();
        v3.name = "Rahul";
        v3.voterIdNumber = 3333333333L;
        v3.dob = "10-05-1995";
        v3.fatherName = "Mahesh";
        v3.address = "Bangalore";
        v3.gender = 'M';
        v3.constituency = "Bangalore North";

        VoterID v4 = new VoterID();
        v4.name = "Sneha";
        v4.voterIdNumber = 4444444444L;
        v4.dob = "20-07-1999";
        v4.fatherName = "Ravi Kumar";
        v4.address = "Hassan";
        v4.gender = 'F';
        v4.constituency = "Hassan Central";

        VoterID v5 = new VoterID();
        v5.name = "Kiran";
        v5.voterIdNumber = 5555555555L;
        v5.dob = "05-03-1997";
        v5.fatherName = "Srinivas";
        v5.address = "Udupi";
        v5.gender = 'M';
        v5.constituency = "Udupi West";

        VoterID v6 = new VoterID();
        v6.name = "Divya";
        v6.voterIdNumber = 6666666666L;
        v6.dob = "25-09-2001";
        v6.fatherName = "Raghav";
        v6.address = "Tumkur";
        v6.gender = 'F';
        v6.constituency = "Tumkur Rural";

        VoterID v7 = new VoterID();
        v7.name = "Arjun";
        v7.voterIdNumber = 7777777777L;
        v7.dob = "30-11-1996";
        v7.fatherName = "Prakash";
        v7.address = "Mangalore";
        v7.gender = 'M';
        v7.constituency = "Mangalore City";


        // Printing Details
        VoterID[] list = {v1, v2, v3, v4, v5, v6, v7};

        for (VoterID v : list) {
            System.out.println("----- Voter ID Details -----");
            System.out.println("Name: " + v.name);
            System.out.println("Voter ID: " + v.voterIdNumber);
            System.out.println("DOB: " + v.dob);
            System.out.println("Father Name: " + v.fatherName);
            System.out.println("Address: " + v.address);
            System.out.println("Gender: " + v.gender);
            System.out.println("Constituency: " + v.constituency);
        }
    }
}