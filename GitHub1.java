class GitHub1 {
    String repoName;
    String email;
	String password;
    long phoneNo;
   
	
	public GitHub1(String repoName,String email,String password,long phoneNo){
		this.repoName = repoName;
		this.email = email;
		this.password =password;
		this.phoneNo= phoneNo;
		System.out.println("SignUp for gitHub has been completed");
	}
	
	
	
	public GitHub1(String repoName,String password){
       this.repoName = repoName;
       this.password =password;

	}
	
	public GitHub1(String userName){
       System.out.println(userName);
	   System.out.println("Sowndarya have been signIn successfully");
	   }
	
	//public void display(){
    //System.out.println("--------***************-------------");

		
	}
