package constructor;
//combination of constructor static and non static block; 
public class A5 {
	int a=10;
	A5(int a){
		System.out.println(1);
	}
	A5(double b){
		System.out.println(2);
	}
	{
		System.out.println(this.a);
	}
	{
		System.out.println(4);
	}
	static {
		System.out.println(5);
	}
	{
		System.out.println(6);
	}
	public static void main(String[] args) {
		System.out.println(8);
		A5 a1=new A5(12.12);
		A5 a2=new A5(10);
		System.out.println(7);
	}
}
