package abstraction;
public class C {
	int a;
	C(int a){
		this.a=a;
	}
	public int hashCode() {
		return this.a+100;
	}
	public static void main(String[] args) {
		C c1=new C(10);
		C c2=new C(20);
		System.out.println(c1.equals(c2));//false
		System.out.println(c1.hashCode());//110
		System.out.println(c2.hashCode());//120
		c1=c2;
		System.out.println();
		System.out.println(c1.equals(c2));//true
		System.out.println(c1.hashCode());//120
		System.out.println(c2.hashCode());//120
	}
}