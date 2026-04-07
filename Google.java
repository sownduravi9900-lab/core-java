class Google {
string companyName;
string founderOne;
String founderTwo;

void setCompany(String cName) {
companyName = cName;
}

void setFounders(String f1, String f2) {
founderOne = f1;
founderTwo = f2;
    }

void displayDetails() {
System.out.println("Company Name: " + companyName);
System.out.println("Founder 1: " + founderOne);
        System.out.println("Founder 2: " + founderTwo);
    }
}