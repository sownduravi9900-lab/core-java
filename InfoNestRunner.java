class InfoNestRunner {

public static void main(String[] args) {

InfoNest i1 = new InfoNest();

i1.platformName = "Google";
i1.serviceName = "Gmail";
i1.userId = "user1@gmail.com";
i1.id = 1001;
i1.ownerName = "Ravi";
i1.isActive = true;
i1.contactNo = 9876543210L;

InfoNest i2 = new InfoNest();

i2.platformName = "Microsoft";
i2.serviceName = "Outlook";
i2.userId = "user2@outlook.com";
i2.id = 1002;
i2.ownerName = "Sowndu";
i2.isActive = false;
i2.contactNo = 9123456780L;

InfoNest i3 = new InfoNest();

i3.platformName = "Meta";
i3.serviceName = "Facebook";
i3.userId = "user3@fb.com";
i3.id = 1003;
i3.ownerName = "Vidhya";
i3.isActive = true;
i3.contactNo = 9988776655L;

InfoNest i4 = new InfoNest();

i4.platformName = "Amazon";
i4.serviceName = "AWS";
i4.userId = "user4@aws.com";
i4.id = 1004;
i4.ownerName = "John";
i4.isActive = false;
i4.contactNo = 9090909090L;

        System.out.println("***** Printing InfoNest Details *****");

        System.out.println("i1 platformName: " + i1.platformName);
        System.out.println("i1 serviceName: " + i1.serviceName);
        System.out.println("i1 userId: " + i1.userId);
        System.out.println("i1 id: " + i1.id);
        System.out.println("i1 ownerName: " + i1.ownerName);
        System.out.println("i1 isActive: " + i1.isActive);
        System.out.println("i1 contactNo: " + i1.contactNo);

        System.out.println("***** Printing InfoNest Details *****");

        System.out.println("i2 platformName: " + i2.platformName);
        System.out.println("i2 serviceName: " + i2.serviceName);
        System.out.println("i2 userId: " + i2.userId);
        System.out.println("i2 id: " + i2.id);
        System.out.println("i2 ownerName: " + i2.ownerName);
        System.out.println("i2 isActive: " + i2.isActive);
        System.out.println("i2 contactNo: " + i2.contactNo);

        System.out.println("***** Printing InfoNest Details *****");

        System.out.println("i3 platformName: " + i3.platformName);
        System.out.println("i3 serviceName: " + i3.serviceName);
        System.out.println("i3 userId: " + i3.userId);
        System.out.println("i3 id: " + i3.id);
        System.out.println("i3 ownerName: " + i3.ownerName);
        System.out.println("i3 isActive: " + i3.isActive);
        System.out.println("i3 contactNo: " + i3.contactNo);

        System.out.println("***** Printing InfoNest Details *****");

        System.out.println("i4 platformName: " + i4.platformName);
        System.out.println("i4 serviceName: " + i4.serviceName);
        System.out.println("i4 userId: " + i4.userId);
        System.out.println("i4 id: " + i4.id);
        System.out.println("i4 ownerName: " + i4.ownerName);
        System.out.println("i4 isActive: " + i4.isActive);
        System.out.println("i4 contactNo: " + i4.contactNo);
    }
}