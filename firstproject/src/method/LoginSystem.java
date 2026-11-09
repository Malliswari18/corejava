package method;

public class LoginSystem {
 boolean login(String username,String password){
	 if(username.equals("malli") && password.equals("java123")){
		 return true;
	 }
	 else {
		 return false;
	 		
 }
 }
 public static void main(String[] args) {
	 LoginSystem ls=new LoginSystem();
	 boolean res=ls.login("malli", "java123");
	 if(res) {
		 System.out.println("successful");
	 }
	 else {
		 System.out.println("invalid");
	 }
	 
 }
 
}
