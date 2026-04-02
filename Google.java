class Google {
    String accountName;
    String email;
    String password;
    long phoneNo;

    public Google(String accountName, String email, String password, long phoneNo) {
        this.accountName = accountName;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        System.out.println("SignUp for Google has been completed");
    }

    public Google(String accountName, String password) {
        this.accountName = accountName;
        this.password = password;
        System.out.println("Login successful for Google account");
    }

    
    public Google(String userName) {
        System.out.println(userName);
        System.out.println("User has signed in successfully");
    }

    public void display() {
        System.out.println("--------***************-------------");
    }
}
