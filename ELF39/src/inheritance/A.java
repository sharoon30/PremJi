package inheritance;
public class A {
	public static void main(String[] args){
	add();
	}
	static void add() {
		sub();
	}
	static void sub() {
		try {
			mul();
		}
		catch(Exception e) {
//		System.out.println(1);
		}
		System.out.println(2);
	}
	static void mul() {
		System.out.println(3);
		System.out.println(2/0);
		System.out.println(3);
		System.out.println(4);
	}
	
}
