class Pinterest {

int postId;
double likes;
String userName;

Pinterest() {
this(1000, 50.0, "DefaultUser");
System.out.println("Pinterest Const 1");
}

Pinterest(int postId, double likes, String userName) {
     this.postId = postId;
     this.likes = likes;
     this.userName = userName;

System.out.println("Pinterest Const 2");
System.out.println("postId : " + postId);
System.out.println("likes : " + likes);
System.out.println("userName : " + userName);
System.out.println("----------************------------");

}
}