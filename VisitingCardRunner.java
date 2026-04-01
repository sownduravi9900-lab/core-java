class VisitingCardRunner {
    public static void main(String[] args) {

        VisitingCard v1 = new VisitingCard();
        v1.personName = "Ravi";
        v1.companyName = "Tech Solutions";
        v1.designation = "Software Engineer";
        v1.phoneNumber = 9876543210L;
        v1.email = "ravi@tech.com";
        v1.address = "Mysore";
        v1.website = "www.techsolutions.com";

        VisitingCard v2 = new VisitingCard();
        v2.personName = "Anu";
        v2.companyName = "Innovate Pvt Ltd";
        v2.designation = "Manager";
        v2.phoneNumber = 9123456780L;
        v2.email = "anu@innovate.com";
        v2.address = "Mandya";
        v2.website = "www.innovate.com";

        VisitingCard v3 = new VisitingCard();
        v3.personName = "Rahul";
        v3.companyName = "Global Tech";
        v3.designation = "Analyst";
        v3.phoneNumber = 9988776655L;
        v3.email = "rahul@global.com";
        v3.address = "Bangalore";
        v3.website = "www.globaltech.com";

        VisitingCard v4 = new VisitingCard();
        v4.personName = "Sneha";
        v4.companyName = "NextGen Corp";
        v4.designation = "HR";
        v4.phoneNumber = 8877665544L;
        v4.email = "sneha@nextgen.com";
        v4.address = "Hassan";
        v4.website = "www.nextgen.com";

        VisitingCard v5 = new VisitingCard();
        v5.personName = "Kiran";
        v5.companyName = "Bright Future";
        v5.designation = "Consultant";
        v5.phoneNumber = 7766554433L;
        v5.email = "kiran@bright.com";
        v5.address = "Udupi";
        v5.website = "www.brightfuture.com";

        VisitingCard v6 = new VisitingCard();
        v6.personName = "Divya";
        v6.companyName = "Skyline Ltd";
        v6.designation = "Designer";
        v6.phoneNumber = 6655443322L;
        v6.email = "divya@skyline.com";
        v6.address = "Tumkur";
        v6.website = "www.skyline.com";

        VisitingCard v7 = new VisitingCard();
        v7.personName = "Arjun";
        v7.companyName = "Future Tech";
        v7.designation = "Developer";
        v7.phoneNumber = 5544332211L;
        v7.email = "arjun@future.com";
        v7.address = "Mangalore";
        v7.website = "www.futuretech.com";


        // Printing Details
        VisitingCard[] list = {v1, v2, v3, v4, v5, v6, v7};

        for (VisitingCard v : list) {
            System.out.println("----- Visiting Card Details -----");
            System.out.println("Name: " + v.personName);
            System.out.println("Company: " + v.companyName);
            System.out.println("Designation: " + v.designation);
            System.out.println("Phone: " + v.phoneNumber);
            System.out.println("Email: " + v.email);
            System.out.println("Address: " + v.address);
            System.out.println("Website: " + v.website);
        }
    }
}