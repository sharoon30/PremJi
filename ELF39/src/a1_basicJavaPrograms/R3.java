package a1_basicJavaPrograms;
public class R3 {
	static int ab=10;
	public static void main(String[] args) {
	R3 r1=new R3();
	r1.add();
	System.out.println(r1.hashCode()+"  R1 address");
	R3 r2=new R3();
	r2.add();
	System.out.println(r2.hashCode()+" R2 address");
	}
	public void add() {
	System.out.println(this.hashCode());
		

	}
}
