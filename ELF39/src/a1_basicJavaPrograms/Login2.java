package a1_basicJavaPrograms;
 public class Login2 extends Login {
	 
	public void login() {
		System.out.println("1 click");
	}
	
	public static void main(String[] args) {
		Login l1=new Login2();
		l1.userName();
		l1.password();
		l1.login();
	}
}
