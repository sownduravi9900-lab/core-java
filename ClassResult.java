class ClassResult{
 static void checkResult(char grade){
 
 switch(grade){
  case'A':
  System.out.println("Distinction");
  break;
  
  case'B':
  System.out.println("First class");
  break;
  
  case'C':
  System.out.println("Second class");
  break;
  
  case'D':
  System.out.println("Pass");
  break;
  
  case'E':
  System.out.println("Fail");
  break;
  
  default:
   System.out.println("Invalid grade");
 }
 }
}