class AppRunner{

public static void main(String[] args){
	
	App.companyName = "Meta";
	App.appName = "Instagram";

    App app1 = new App();
	app1.companyName = "Meta";
	app1.appName = "Facebook";
	app1.personName = "Sowndarya H R";
    app1.email = "sownduravi9900@gmail.com";
    app1.phNo = 9900461452L;
    app1.dob = "18/09/2005";
    app1.userName = "sownuravi";
    app1.password = "sowndu@123";

    System.out.println("app1 :"+ App.companyName);
    System.out.println("app1 :"+ App.appName);
    System.out.println("app1 :"+ app1.personName);
    System.out.println("app1 :"+ app1.phNo);
    System.out.println("app1 :"+ app1.dob);
    System.out.println("app1 :"+ app1.userName);
    System.out.println("app1 :"+ app1.password);
	
	
    App app2 = new App();
	app2.companyName = "Meta";
	app2.appName = "Facebook";
	app2.personName = "Yashwanth";
    app2.email = "yashwanth@gmail.com";
    app2.phNo = 9019337963L;
    app2.dob = "14/09/2005";
    app2.userName = "rash driver";
    app2.password = "Yashu@123";

    System.out.println("app2 :"+ App.companyName);
    System.out.println("app2 :"+ App.appName);
    System.out.println("app2 :"+ app2.personName);
    System.out.println("app2 :"+ app2.email);
    System.out.println("app2 :"+ app2.phNo);
	System.out.println("app1 :"+ app2.dob);
    System.out.println("app2 :"+ app2.userName);
    System.out.println("app2 :"+ app2.password);
}
}