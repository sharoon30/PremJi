package a1_basicJavaPrograms;
public class R1 {
	public static void add(int a,double b) {
		double c=a+b;
		System.out.println(c);
	}
	void mul(String args,int b,double c) {
		System.out.println(args+" "+b+" "+c);
	}
	public static void main(String[] args) {
		int a=10;int r=a/=2;
		System.out.println(r);
	}
}