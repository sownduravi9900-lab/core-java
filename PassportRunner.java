class PassportRunner {
    public static void main(String[] args) {

        Passport p1 = new Passport();
        p1.passportHolderName = "Ravi";
        p1.passportNumber = "P1111111";
        p1.country = "India";
        p1.placeOfBirth = "Mysore";
        p1.issueDate = "01-01-2020";
        p1.expiryDate = "01-01-2030";
        p1.gender = 'M';

        Passport p2 = new Passport();
        p2.passportHolderName = "Anu";
        p2.passportNumber = "P2222222";
        p2.country = "India";
        p2.placeOfBirth = "Mandya";
        p2.issueDate = "15-08-2021";
        p2.expiryDate = "15-08-2031";
        p2.gender = 'F';

        Passport p3 = new Passport();
        p3.passportHolderName = "Rahul";
        p3.passportNumber = "P3333333";
        p3.country = "India";
        p3.placeOfBirth = "Bangalore";
        p3.issueDate = "10-05-2019";
        p3.expiryDate = "10-05-2029";
        p3.gender = 'M';

        Passport p4 = new Passport();
        p4.passportHolderName = "Sneha";
        p4.passportNumber = "P4444444";
        p4.country = "India";
        p4.placeOfBirth = "Hassan";
        p4.issueDate = "20-07-2022";
        p4.expiryDate = "20-07-2032";
        p4.gender = 'F';

        Passport p5 = new Passport();
        p5.passportHolderName = "Kiran";
        p5.passportNumber = "P5555555";
        p5.country = "India";
        p5.placeOfBirth = "Udupi";
        p5.issueDate = "05-03-2018";
        p5.expiryDate = "05-03-2028";
        p5.gender = 'M';

        Passport p6 = new Passport();
        p6.passportHolderName = "Divya";
        p6.passportNumber = "P6666666";
        p6.country = "India";
        p6.placeOfBirth = "Tumkur";
        p6.issueDate = "25-09-2020";
        p6.expiryDate = "25-09-2030";
        p6.gender = 'F';

        Passport p7 = new Passport();
        p7.passportHolderName = "Arjun";
        p7.passportNumber = "P7777777";
        p7.country = "India";
        p7.placeOfBirth = "Mangalore";
        p7.issueDate = "30-11-2017";
        p7.expiryDate = "30-11-2027";
        p7.gender = 'M';


        // Printing Details
        Passport[] list = {p1, p2, p3, p4, p5, p6, p7};

        for (Passport p : list) {
            System.out.println("----- Passport Details -----");
            System.out.println("Name: " + p.passportHolderName);
            System.out.println("Passport No: " + p.passportNumber);
            System.out.println("Country: " + p.country);
            System.out.println("Place of Birth: " + p.placeOfBirth);
            System.out.println("Issue Date: " + p.issueDate);
            System.out.println("Expiry Date: " + p.expiryDate);
            System.out.println("Gender: " + p.gender);
        }
    }
}