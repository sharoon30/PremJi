package inheritance;
public class D {
	int a=10;
	int b=20;
	public static void main(String[] args) {
		Object o1=new Object();
		D d1=new D();
		o1=d1;
		D d2=(D)o1;
		System.out.println(d2.b);
	}
}