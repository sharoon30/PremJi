package inheritance;

public class E extends D {
	int c=30;
	public static void main(String[] args) {
		D d1=new D();
		E e1=new E();
		d1=e1;//upcasting
		System.out.println(d1.a);
		System.out.println(d1.b);
		E e2=(E)d1;//downcasting
		System.out.println(e2.a);
		System.out.println(e2.b);
		System.out.println(e2.c);
		
		
		
		
	
		
	}

}
