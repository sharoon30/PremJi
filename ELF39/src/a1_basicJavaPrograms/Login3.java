package a1_basicJavaPrograms;
public class Login3 extends Login2{
	
public	void password() {
		System.out.println("1 special char");
	}

public void login() {
	System.out.println("Tap");
}	

	public static void main(String[] args) {
		Login3 l3=new Login3();
		l3.userName();
		l3.password();
		l3.login();
	}
}