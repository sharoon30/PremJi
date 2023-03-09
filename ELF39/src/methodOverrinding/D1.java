package methodOverrinding;
public class D1 extends C1 {
static	int a=10;
	
static	void zero() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		C1 c1=new D1();
		c1.zero();
	
	}
}