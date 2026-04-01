class PanCardRunner {
    public static void main(String[] args) {

        PanCard p1 = new PanCard();
        p1.holderName = "Ravi";
        p1.panNumber = "ABCDE1234F";
        p1.dateOfBirth = "01-01-2000";
        p1.fatherName = "Suresh";
        p1.address = "Mysore";
        p1.nationality = "Indian";
        p1.gender = 'M';

        PanCard p2 = new PanCard();
        p2.holderName = "Anu";
        p2.panNumber = "XYZAB5678K";
        p2.dateOfBirth = "15-08-1998";
        p2.fatherName = "Ramesh";
        p2.address = "Mandya";
        p2.nationality = "Indian";
        p2.gender = 'F';

        PanCard p3 = new PanCard();
        p3.holderName = "Rahul";
        p3.panNumber = "PQRSX1111L";
        p3.dateOfBirth = "10-05-1995";
        p3.fatherName = "Mahesh";
        p3.address = "Bangalore";
        p3.nationality = "Indian";
        p3.gender = 'M';

        PanCard p4 = new PanCard();
        p4.holderName = "Sneha";
        p4.panNumber = "LMNOP2222Q";
        p4.dateOfBirth = "20-07-1999";
        p4.fatherName = "Ravi Kumar";
        p4.address = "Hassan";
        p4.nationality = "Indian";
        p4.gender = 'F';

        PanCard p5 = new PanCard();
        p5.holderName = "Kiran";
        p5.panNumber = "UVWXZ3333R";
        p5.dateOfBirth = "05-03-1997";
        p5.fatherName = "Srinivas";
        p5.address = "Udupi";
        p5.nationality = "Indian";
        p5.gender = 'M';

        PanCard p6 = new PanCard();
        p6.holderName = "Divya";
        p6.panNumber = "ABCDE4444T";
        p6.dateOfBirth = "25-09-2001";
        p6.fatherName = "Raghav";
        p6.address = "Tumkur";
        p6.nationality = "Indian";
        p6.gender = 'F';

        PanCard p7 = new PanCard();
        p7.holderName = "Arjun";
        p7.panNumber = "FGHIJ5555Y";
        p7.dateOfBirth = "30-11-1996";
        p7.fatherName = "Prakash";
        p7.address = "Mangalore";
        p7.nationality = "Indian";
        p7.gender = 'M';


        // Printing Details
        PanCard[] list = {p1, p2, p3, p4, p5, p6, p7};

        for (PanCard p : list) {
            System.out.println("----- Pan Card Details -----");
            System.out.println("Name: " + p.holderName);
            System.out.println("PAN Number: " + p.panNumber);
            System.out.println("DOB: " + p.dateOfBirth);
            System.out.println("Father Name: " + p.fatherName);
            System.out.println("Address: " + p.address);
            System.out.println("Nationality: " + p.nationality);
            System.out.println("Gender: " + p.gender);
        }
    }
}