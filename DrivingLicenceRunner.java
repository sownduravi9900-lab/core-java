class DrivingLicenceRunner {
    public static void main(String[] args) {

        DrivingLicence d1 = new DrivingLicence();
        d1.licenceHolderName = "Ravi";
        d1.licenceNumber = "DL1111";
        d1.vehicleType = "MCWG";
        d1.issueDate = "10-05-2020";
        d1.expiryDate = "10-05-2030";
        d1.issuingAuthority = "Mysore RTO";
        d1.contactNumber = 9876543210L;

        DrivingLicence d2 = new DrivingLicence();
        d2.licenceHolderName = "Anu";
        d2.licenceNumber = "DL2222";
        d2.vehicleType = "LMV";
        d2.issueDate = "20-08-2021";
        d2.expiryDate = "20-08-2031";
        d2.issuingAuthority = "Mandya RTO";
        d2.contactNumber = 9123456780L;

        DrivingLicence d3 = new DrivingLicence();
        d3.licenceHolderName = "Rahul";
        d3.licenceNumber = "DL3333";
        d3.vehicleType = "HMV";
        d3.issueDate = "15-03-2019";
        d3.expiryDate = "15-03-2029";
        d3.issuingAuthority = "Bangalore RTO";
        d3.contactNumber = 9988776655L;

        DrivingLicence d4 = new DrivingLicence();
        d4.licenceHolderName = "Sneha";
        d4.licenceNumber = "DL4444";
        d4.vehicleType = "LMV";
        d4.issueDate = "12-07-2022";
        d4.expiryDate = "12-07-2032";
        d4.issuingAuthority = "Hassan RTO";
        d4.contactNumber = 8877665544L;

        DrivingLicence d5 = new DrivingLicence();
        d5.licenceHolderName = "Kiran";
        d5.licenceNumber = "DL5555";
        d5.vehicleType = "MCWG";
        d5.issueDate = "05-01-2018";
        d5.expiryDate = "05-01-2028";
        d5.issuingAuthority = "Udupi RTO";
        d5.contactNumber = 7766554433L;

        DrivingLicence d6 = new DrivingLicence();
        d6.licenceHolderName = "Divya";
        d6.licenceNumber = "DL6666";
        d6.vehicleType = "LMV";
        d6.issueDate = "25-09-2020";
        d6.expiryDate = "25-09-2030";
        d6.issuingAuthority = "Tumkur RTO";
        d6.contactNumber = 6655443322L;

        DrivingLicence d7 = new DrivingLicence();
        d7.licenceHolderName = "Arjun";
        d7.licenceNumber = "DL7777";
        d7.vehicleType = "HMV";
        d7.issueDate = "30-11-2017";
        d7.expiryDate = "30-11-2027";
        d7.issuingAuthority = "Mangalore RTO";
        d7.contactNumber = 5544332211L;

        DrivingLicence[] list = {d1, d2, d3, d4, d5, d6, d7};

        for (DrivingLicence d : list) {
            System.out.println("----- Driving Licence Details -----");
            System.out.println("Name: " + d.licenceHolderName);
            System.out.println("Licence No: " + d.licenceNumber);
            System.out.println("Vehicle Type: " + d.vehicleType);
            System.out.println("Issue Date: " + d.issueDate);
            System.out.println("Expiry Date: " + d.expiryDate);
            System.out.println("Authority: " + d.issuingAuthority);
            System.out.println("Contact: " + d.contactNumber);
        }
    }
}