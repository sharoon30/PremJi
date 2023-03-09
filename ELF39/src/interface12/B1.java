package interface12;
public class B1 {
	int b=4;
	static int a;
	static {
		a=30;
	}
	static {
		a=40;		
	}
	public static void main(String[] args) {
		B1 b1=new B1();
		b1.a=a++ + ++a;
		b1.b=70;	
		B1 b2=new B1();
		b2.a=90;
		b2.b=++b2.b;		
		apple();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b2.a);
		System.out.println(b2.b);
		
	}
	static void apple() {
		System.out.println(a++);
	}
}