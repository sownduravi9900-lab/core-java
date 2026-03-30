class AppNovaRunner {

    public static void main(String[] args) {

        AppNova a1 = new AppNova();

        a1.deviceName = "Android";
        a1.version = "1.0";
        a1.developer = "Google";
        a1.downloads = 100000;
        a1.rating = 4.5;
        a1.isFree = true;
        a1.category = "Social";

        AppNova a2 = new AppNova();

        a2.deviceName = "iOS";
        a2.version = "2.1";
        a2.developer = "Apple";
        a2.downloads = 50000;
        a2.rating = 4.2;
        a2.isFree = false;
        a2.category = "Productivity";

        AppNova a3 = new AppNova();

        a3.deviceName = "Windows";
        a3.version = "3.0";
        a3.developer = "Microsoft";
        a3.downloads = 75000;
        a3.rating = 4.0;
        a3.isFree = true;
        a3.category = "Utility";

        AppNova a4 = new AppNova();

        a4.deviceName = "Linux";
        a4.version = "1.5";
        a4.developer = "OpenSource";
        a4.downloads = 30000;
        a4.rating = 4.7;
        a4.isFree = true;
        a4.category = "Development";

        System.out.println("***** Printing AppNova Details *****");

        System.out.println("a1 deviceName: " + a1.deviceName);
        System.out.println("a1 version: " + a1.version);
        System.out.println("a1 developer: " + a1.developer);
        System.out.println("a1 downloads: " + a1.downloads);
        System.out.println("a1 rating: " + a1.rating);
        System.out.println("a1 isFree: " + a1.isFree);
        System.out.println("a1 category: " + a1.category);

        System.out.println("***** Printing AppNova Details *****");

        System.out.println("a2 deviceName: " + a2.deviceName);
        System.out.println("a2 version: " + a2.version);
        System.out.println("a2 developer: " + a2.developer);
        System.out.println("a2 downloads: " + a2.downloads);
        System.out.println("a2 rating: " + a2.rating);
        System.out.println("a2 isFree: " + a2.isFree);
        System.out.println("a2 category: " + a2.category);

        System.out.println("***** Printing AppNova Details *****");

        System.out.println("a3 deviceName: " + a3.deviceName);
        System.out.println("a3 version: " + a3.version);
        System.out.println("a3 developer: " + a3.developer);
        System.out.println("a3 downloads: " + a3.downloads);
        System.out.println("a3 rating: " + a3.rating);
        System.out.println("a3 isFree: " + a3.isFree);
        System.out.println("a3 category: " + a3.category);

        System.out.println("***** Printing AppNova Details *****");

        System.out.println("a4 deviceName: " + a4.deviceName);
        System.out.println("a4 version: " + a4.version);
        System.out.println("a4 developer: " + a4.developer);
        System.out.println("a4 downloads: " + a4.downloads);
        System.out.println("a4 rating: " + a4.rating);
        System.out.println("a4 isFree: " + a4.isFree);
        System.out.println("a4 category: " + a4.category);
    }
}